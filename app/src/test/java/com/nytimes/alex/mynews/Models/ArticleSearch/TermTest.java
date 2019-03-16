package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TermTest {
    Term mTerm;
    @Before
    public void setUp() throws Exception {
        mTerm = new Term();
    }

    @Test
    public void getTerm() throws Exception {
        mTerm.setTerm("getTerm");
        assertTrue("getTerm", mTerm.getTerm() == "getTerm");
    }

    @Test
    public void setTerm() throws Exception {
        mTerm.setTerm("setTerm");
        assertTrue("setTerm", mTerm.getTerm() == "setTerm");
    }

    @Test
    public void getCount() throws Exception {
        mTerm.setCount(1);
        assertTrue("getCount", mTerm.getCount() == 1);
    }

    @Test
    public void setCount() throws Exception {
        mTerm.setCount(2);
        assertTrue("setCount", mTerm.getCount() == 2);
    }

}