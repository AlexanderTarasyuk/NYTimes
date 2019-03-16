package com.nytimes.alex.mynews.Models.MostPopular;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MostPopularMetadatumTest {
    MostPopularMetadatum mMostPopularMetadatum;

    @Before
    public void initMetadatum(){
        mMostPopularMetadatum = new MostPopularMetadatum();
    }

    @Test
    public void getUrl() throws Exception {
        mMostPopularMetadatum.setUrl("getUrl");

        assertTrue("getUrl", mMostPopularMetadatum.getUrl() == "getUrl");
    }

    @Test
    public void setUrl() throws Exception {
        mMostPopularMetadatum.setUrl("getUrl");

        assertTrue("setUrl", mMostPopularMetadatum.getUrl() == "getUrl");
    }

    @Test
    public void getFormat() throws Exception {
        mMostPopularMetadatum.setFormat("getFormat");

        assertTrue("getFormat", mMostPopularMetadatum.getFormat() == "getFormat");
    }

    @Test
    public void setFormat() throws Exception {
        mMostPopularMetadatum.setFormat("setFormat");

        assertTrue("setFormat", mMostPopularMetadatum.getFormat() == "setFormat");
    }

    @Test
    public void getHeight() throws Exception {
        mMostPopularMetadatum.setHeight(1);

        assertTrue("getHeight", mMostPopularMetadatum.getHeight() == 1);
    }

    @Test
    public void setHeight() throws Exception {
        mMostPopularMetadatum.setHeight(2);

        assertTrue("setHeight", mMostPopularMetadatum.getHeight() == 2);
    }

    @Test
    public void getWidth() throws Exception {
        mMostPopularMetadatum.setWidth(1);

        assertTrue("getWidth", mMostPopularMetadatum.getWidth() == 1);
    }

    @Test
    public void setWidth() throws Exception {
        mMostPopularMetadatum.setWidth(2);

        assertTrue("setWidth", mMostPopularMetadatum.getWidth() == 2);
    }

}