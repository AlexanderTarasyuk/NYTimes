package com.nytimes.alex.mynews.Views.Adapters;

import com.bumptech.glide.RequestManager;
import com.nytimes.alex.mynews.Models.MostPopular.MostPopularResult;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class MostPopularAdapterTest {
    MostPopularAdapter mMostPopularAdapter;
    List<MostPopularResult> mMostPopularResults;
    MostPopularResult mResult1, mResult2, mResult3;
    RequestManager glide;

    @Before
    public void initTest() {
        mResult1 = new MostPopularResult();
        mResult2 = new MostPopularResult();
        mResult3 = new MostPopularResult();

        mMostPopularResults = new ArrayList<>();

        mMostPopularAdapter = new MostPopularAdapter(mMostPopularResults, glide);

    }

    @Test
    public void itemCountTest() throws Exception {
        mMostPopularResults.add(mResult1);
        mMostPopularResults.add(mResult2);
        mMostPopularResults.add(mResult3);
        assertEquals(3, mMostPopularAdapter.getItemCount());
    }
}