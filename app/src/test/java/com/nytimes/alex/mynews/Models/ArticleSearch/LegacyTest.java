package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class LegacyTest {
    Legacy mLegacy;
    @Before
    public void setUp() throws Exception {
        mLegacy = new Legacy();
    }

    @Test
    public void getHasthumbnail() throws Exception {
        mLegacy.setHasthumbnail("getHasthumbnail");
        assertTrue("getHasthumbnail", mLegacy.getHasthumbnail() == "getHasthumbnail");
    }

    @Test
    public void setHasthumbnail() throws Exception {
        mLegacy.setHasthumbnail("setHasthumbnail");
        assertTrue("setHasthumbnail", mLegacy.getHasthumbnail() == "setHasthumbnail");
    }

    @Test
    public void getThumbnailheight() throws Exception {
        mLegacy.setThumbnailheight(1);
        assertTrue("getThumbnailheight", mLegacy.getThumbnailheight() == 1);
    }

    @Test
    public void setThumbnailheight() throws Exception {
        mLegacy.setThumbnailheight(2);
        assertTrue("setThumbnailheight", mLegacy.getThumbnailheight() == 2);
    }

    @Test
    public void getThumbnail() throws Exception {
        mLegacy.setThumbnail("getThumbnail");
        assertTrue("getThumbnail", mLegacy.getThumbnail() == "getThumbnail");
    }

    @Test
    public void setThumbnail() throws Exception {
        mLegacy.setThumbnail("setThumbnail");
        assertTrue("setThumbnail", mLegacy.getThumbnail() == "setThumbnail");
    }

    @Test
    public void getXlargewidth() throws Exception {
        mLegacy.setXlargewidth(1);
        assertTrue("getXlargewidth", mLegacy.getXlargewidth() == 1);
    }

    @Test
    public void setXlargewidth() throws Exception {
        mLegacy.setXlargewidth(2);
        assertTrue("setXlargewidth", mLegacy.getXlargewidth() == 2);
    }

    @Test
    public void getXlargeheight() throws Exception {
        mLegacy.setXlargeheight(1);
        assertTrue("getXlargeheight", mLegacy.getXlargeheight() == 1);
    }

    @Test
    public void setXlargeheight() throws Exception {
        mLegacy.setXlargeheight(1);
        assertTrue("setXlargeheight", mLegacy.getXlargeheight() == 1);
    }

    @Test
    public void getXlarge() throws Exception {
        mLegacy.setXlarge("getXlarge");
        assertTrue("getXlarge", mLegacy.getXlarge() == "getXlarge");
    }

    @Test
    public void setXlarge() throws Exception {
        mLegacy.setXlarge("setXlarge");
        assertTrue("setXlarge", mLegacy.getXlarge() == "setXlarge");
    }

    @Test
    public void getHasxlarge() throws Exception {
        mLegacy.setHasxlarge("getHasxlarge");
        assertTrue("getHasxlarge", mLegacy.getHasxlarge() == "getHasxlarge");
    }

    @Test
    public void setHasxlarge() throws Exception {
        mLegacy.setHasxlarge("setHasxlarge");
        assertTrue("setHasxlarge", mLegacy.getHasxlarge() == "setHasxlarge");
    }

}