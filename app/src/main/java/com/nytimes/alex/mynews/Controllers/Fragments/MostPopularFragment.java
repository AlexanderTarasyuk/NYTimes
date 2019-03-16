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
import com.nytimes.alex.mynews.Models.MostPopular.MostPopular;
import com.nytimes.alex.mynews.Models.MostPopular.MostPopularResult;
import com.nytimes.alex.mynews.R;
import com.nytimes.alex.mynews.Utils.ItemClickSupport;
import com.nytimes.alex.mynews.Utils.NYTStreams;
import com.nytimes.alex.mynews.Views.Adapters.MostPopularAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;

/**
 * A simple {@link Fragment} subclass.
 */
public class MostPopularFragment extends Fragment {

    // FOR DESIGN
    @BindView(R.id.fragment_most_popular_recycler_view)
    RecyclerView mRecyclerView;

    // Declare the SwipeRefreshLayout
    @BindView(R.id.fragment_most_popular_swipe_container)
    SwipeRefreshLayout mSwipeRefreshLayout;

    // FOR DATA
    private Disposable mDisposable;
    private List<MostPopularResult> mMostPopularResults = new ArrayList<>();
    private MostPopularAdapter mMostPopularAdapter;

    public static MostPopularFragment newInstance() {
        return (new MostPopularFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View result = inflater.inflate(R.layout.fragment_most_popular, container, false);
        ButterKnife.bind(this, result);
        this.configureMostPopularRecyclerView();
        this.executeHttpMostPopularRequest();
        this.configureSwipeRefreshLayout();
        this.configureOnClickRecyclerView();
        // Inflate the layout for this fragment
        return result;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy MostPopularFragment");
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
                        intent.putExtra("openUrl", mMostPopularResults.get(position).getUrl());
                        startActivity(intent);
                    }
                });
    }

    // -----------------
    // CONFIGURATION
    // -----------------

    // Configure RecyclerView, Adapter, LayoutManager & glue it together
    private void configureMostPopularRecyclerView(){
        this.mMostPopularResults = new ArrayList<>();
        this.mMostPopularAdapter = new MostPopularAdapter(this.mMostPopularResults, Glide.with(this));
        this.mRecyclerView.setAdapter(this.mMostPopularAdapter);
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    // Configure the SwipeRefreshLayout
    private void configureSwipeRefreshLayout(){
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                executeHttpMostPopularRequest();
            }
        });
    }

    // -----------------
    // HTTP (RxJAVA)
    // -----------------

    // Execute our Stream
    private void executeHttpMostPopularRequest(){
        // Execute the stream subscribing to Observable defined inside GithubStream
        this.mDisposable = NYTStreams.streamFetchMostPopular("all-sections").subscribeWith(new DisposableObserver<MostPopular>(){
            @Override
            public void onNext(MostPopular mostPopular) {
                // Update RecyclerView after getting results from NYT API
                updateMostPopularUI(mostPopular.getMostPopularResults());
            }

            @Override
            public void onError(Throwable e) {
                Log.e("MostPopular onError", Log.getStackTraceString(e));
            }

            @Override
            public void onComplete() {
                Log.e("MostPopular onComplete", "On Complete !!");

            }
        });
    }

    private void disposeWhenDestroy(){
        if(this.mDisposable != null && !this.mDisposable.isDisposed()) this.mDisposable.dispose();
    }

    // -----------------
    // UPDATE UI
    // -----------------

    private void updateMostPopularUI(List<MostPopularResult> mostPopularResults){
        mSwipeRefreshLayout.setRefreshing(false);
        mMostPopularResults.clear();
        mMostPopularResults.addAll(mostPopularResults);
        mMostPopularAdapter.notifyDataSetChanged();
    }
}
