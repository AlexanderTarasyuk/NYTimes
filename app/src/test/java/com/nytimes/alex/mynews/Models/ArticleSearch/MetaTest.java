package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MetaTest {
    Meta mMeta;
    @Before
    public void setUp() throws Exception {
        mMeta = new Meta();
    }

    @Test
    public void getHits() throws Exception {
        mMeta.setHits(1);
        assertTrue("getHits", mMeta.getHits() == 1);
    }

    @Test
    public void setHits() throws Exception {
        mMeta.setHits(2);
        assertTrue("setHits", mMeta.getHits() == 2);
    }

    @Test
    public void getTime() throws Exception {
        mMeta.setTime(1);
        assertTrue("getTime", mMeta.getTime() == 1);
    }

    @Test
    public void setTime() throws Exception {
        mMeta.setTime(2);
        assertTrue("setTime", mMeta.getTime() == 2);
    }

    @Test
    public void getOffset() throws Exception {
        mMeta.setOffset(1);
        assertTrue("getOffset", mMeta.getOffset() == 1);
    }

    @Test
    public void setOffset() throws Exception {
        mMeta.setOffset(2);
        assertTrue("setOffset", mMeta.getOffset() == 2);
    }

}