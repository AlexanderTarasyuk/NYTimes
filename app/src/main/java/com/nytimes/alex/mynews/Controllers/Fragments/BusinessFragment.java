package com.nytimes.alex.mynews.Controllers.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.nytimes.alex.mynews.Controllers.Activities.WebActivity;
import com.nytimes.alex.mynews.Models.TopStories.TopStories;
import com.nytimes.alex.mynews.Models.TopStories.TopStoriesResult;
import com.nytimes.alex.mynews.R;
import com.nytimes.alex.mynews.Utils.ItemClickSupport;
import com.nytimes.alex.mynews.Utils.NYTStreams;
import com.nytimes.alex.mynews.Views.Adapters.TopStoriesAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusinessFragment extends Fragment {

    // FOR DESIGN
    @BindView(R.id.fragment_business_recycler_view)
    RecyclerView mRecyclerView;

    // Declare the SwipeRefreshLayout
    @BindView(R.id.fragment_business_swipe_container)
    SwipeRefreshLayout mSwipeRefreshLayout;

    // FOR DATA
    private Disposable mDisposable;
    private List<TopStoriesResult> mTopStoriesResults = new ArrayList<>();
    private TopStoriesAdapter mTopStoriesAdapter;


    public static BusinessFragment newInstance() {
        return (new BusinessFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_business, container, false);
        ButterKnife.bind(this, result);
        this.configureTopStoriesRecyclerView();
        this.executeHttpTopStoriesRequest();
        this.configureSwipeRefreshLayout();
        this.configureOnClickRecyclerView();
        // Inflate the layout for this fragment
        return result;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy BusinessFragment");
        this.disposeWhenDestroy();
    }

    // -----------------
    // ACTION
    // -----------------

    // Configure item click on RecyclerView
    private void configureOnClickRecyclerView(){
        ItemClickSupport.addTo(mRecyclerView, R.layout.fragment_page_item)
                .setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        Intent intent = new Intent(getContext(), WebActivity.class);
                        intent.putExtra("openUrl", mTopStoriesResults.get(position).getUrl());
                        startActivity(intent);
                    }
                });
    }


    // -----------------
    // CONFIGURATION
    // -----------------

    // Configure RecyclerView, Adapter, LayoutManager & glue it together
    private void configureTopStoriesRecyclerView(){
        this.mTopStoriesResults = new ArrayList<>();
        this.mTopStoriesAdapter = new TopStoriesAdapter(this.mTopStoriesResults, Glide.with(this));
        this.mRecyclerView.setAdapter(this.mTopStoriesAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    // Configure the SwipeRefreshLayout
    private void configureSwipeRefreshLayout(){
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                executeHttpTopStoriesRequest();
            }
        });
    }

    // -----------------
    // HTTP (RxJAVA)
    // -----------------

    // Execute our Stream
    private void executeHttpTopStoriesRequest(){
        // Execute the stream subscribing to Observable defined inside GithubStream
        NYTStreams nytStreams = new NYTStreams();
        this.mDisposable = nytStreams.streamFetchBusinessTopStories().subscribeWith(new DisposableObserver<TopStories>(){
            @Override
            public void onNext(TopStories topStories) {
                Log.e("BusinessF - onNext", "On Next BusinessFragment");
                // Update RecyclerView after getting results from NYT API
                updateTopStoriesUI(topStories.getTopStoriesResults());
            }

            @Override
            public void onError(Throwable e) {
                Log.e("BusinessF - onError", Log.getStackTraceString(e));
            }

            @Override
            public void onComplete() {
                Log.e("BusinessF - onComplete", "On Complete BusinessFragment");

            }
        });
    }

    private void disposeWhenDestroy(){
        if(this.mDisposable != null && !this.mDisposable.isDisposed()) this.mDisposable.dispose();
    }

    // -----------------
    // UPDATE UI
    // -----------------

    private void updateTopStoriesUI(List<TopStoriesResult> topStoriesResults){
        mSwipeRefreshLayout.setRefreshing(false);
        mTopStoriesResults.clear();
        mTopStoriesResults.addAll(topStoriesResults);
        mTopStoriesAdapter.notifyDataSetChanged();
    }

}
