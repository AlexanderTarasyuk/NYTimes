package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class HeadlineTest {
    Headline mHeadline;

    @Before
    public void setUp() throws Exception {
        mHeadline = new Headline();
    }

    @Test
    public void getMain() throws Exception {
        mHeadline.setMain("getMain");
        assertTrue("getMain", mHeadline.getMain() == "getMain");
    }

    @Test
    public void setMain() throws Exception {
        mHeadline.setMain("getMain");
        assertTrue("setMain", mHeadline.getMain() == "getMain");
    }

    @Test
    public void getKicker() throws Exception {
        mHeadline.setKicker("getKicker");
        assertTrue("getKicker", mHeadline.getKicker() == "getKicker");
    }

    @Test
    public void setKicker() throws Exception {
        mHeadline.setKicker("setKicker");
        assertTrue("setKicker", mHeadline.getKicker() == "setKicker");
    }

}