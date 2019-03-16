package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class KeywordTest {
    Keyword mKeyword;
    @Before
    public void setUp() throws Exception {
        mKeyword = new Keyword();
    }

    @Test
    public void getRank() throws Exception {
        mKeyword.setRank("getRank");
        assertTrue("getRank", mKeyword.getRank() == "getRank");
    }

    @Test
    public void setRank() throws Exception {
        mKeyword.setRank("getRank");
        assertTrue("setRank", mKeyword.getRank() == "getRank");
    }

    @Test
    public void getName() throws Exception {
        mKeyword.setName("getName");
        assertTrue("getName", mKeyword.getName() == "getName");
    }

    @Test
    public void setName() throws Exception {
        mKeyword.setName("setName");
        assertTrue("setName", mKeyword.getName() == "setName");
    }

    @Test
    public void getValue() throws Exception {
        mKeyword.setValue("getValue");
        assertTrue("getValue", mKeyword.getValue() == "getValue");
    }

    @Test
    public void setValue() throws Exception {
        mKeyword.setValue("getValue");
        assertTrue("setValue", mKeyword.getValue() == "getValue");
    }

}