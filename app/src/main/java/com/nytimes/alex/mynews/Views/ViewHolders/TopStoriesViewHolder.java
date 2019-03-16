package com.nytimes.alex.mynews.Views.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.nytimes.alex.mynews.Models.TopStories.TopStoriesResult;
import com.nytimes.alex.mynews.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class TopStoriesViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.fragment_page_item_title)
    TextView mTitle;
    @BindView(R.id.fragment_page_item_image)
    ImageView mImageView;
    @BindView(R.id.fragment_page_item_section)
    TextView mSection;
    @BindView(R.id.fragment_page_item_date)
    TextView mDate;

    public TopStoriesViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateWithTopStories(TopStoriesResult topStoriesResult, RequestManager glide) {
        this.mTitle.setText(topStoriesResult.getTitle());
        this.mDate.setText(topStoriesResult.getCreatedDate().substring(0, 10));
        if (!topStoriesResult.getSubsection().isEmpty()) {
            this.mSection.setText(topStoriesResult.getSection() + " > " + topStoriesResult.getSubsection());
        } else {
            this.mSection.setText(topStoriesResult.getSection());
        }
        if (topStoriesResult.getMultimedia().size() != 0) {
            glide.load(topStoriesResult.getMultimedia().get(0).getUrl())
                    .into(mImageView);
        } else {
            mImageView.setImageResource(R.drawable.nyt_logo);
        }
    }
}
