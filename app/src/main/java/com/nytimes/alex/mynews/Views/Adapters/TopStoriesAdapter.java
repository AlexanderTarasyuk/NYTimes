package com.nytimes.alex.mynews.Views.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.RequestManager;
import com.nytimes.alex.mynews.Models.TopStories.TopStoriesResult;
import com.nytimes.alex.mynews.R;
import com.nytimes.alex.mynews.Views.ViewHolders.TopStoriesViewHolder;

import java.util.List;



public class TopStoriesAdapter extends RecyclerView.Adapter<TopStoriesViewHolder> {
    // FOR DATA
    private List<TopStoriesResult> mTopStoriesResults;

    private RequestManager glide;

    public TopStoriesAdapter(List<TopStoriesResult> topStoriesResults, RequestManager glide) {
        this.mTopStoriesResults = topStoriesResults;
        this.glide = glide;
    }

    @Override
    public TopStoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create view holder and inflating its xml layout
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_page_item, parent, false);

        return new TopStoriesViewHolder(view);
    }

    // Update view holder with a Top Story
    @Override
    public void onBindViewHolder(TopStoriesViewHolder holder, int position) {
        holder.updateWithTopStories(this.mTopStoriesResults.get(position), this.glide);
    }

    // Return the total count of items in the list
    @Override
    public int getItemCount() {
        return this.mTopStoriesResults.size();
    }
}
