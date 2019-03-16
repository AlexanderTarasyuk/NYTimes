package com.nytimes.alex.mynews.Views.Adapters;

import com.bumptech.glide.RequestManager;
import com.nytimes.alex.mynews.Models.TopStories.TopStoriesResult;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TopStoriesAdapterTest {
    TopStoriesAdapter mTopStoriesAdapter;
    List<TopStoriesResult> mTopStoriesResults;
    TopStoriesResult mResult1, mResult2, mResult3;
    RequestManager glide;

    @Before
    public void initTest(){
        mResult1 = new TopStoriesResult();
        mResult2 = new TopStoriesResult();
        mResult3 = new TopStoriesResult();

        mTopStoriesResults = new ArrayList<>();

        mTopStoriesAdapter = new TopStoriesAdapter(mTopStoriesResults, glide);
    }

    @Test
    public void itemCountTest() throws Exception {
        mTopStoriesResults.add(mResult1);
        mTopStoriesResults.add(mResult2);
        mTopStoriesResults.add(mResult3);
        assertEquals(3, mTopStoriesAdapter.getItemCount());
    }
}