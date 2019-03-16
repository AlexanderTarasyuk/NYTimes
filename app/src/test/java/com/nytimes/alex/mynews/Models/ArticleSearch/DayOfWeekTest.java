package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class DayOfWeekTest {
    DayOfWeek mDayOfWeek;

    @Before
    public void setUp() throws Exception {
        mDayOfWeek = new DayOfWeek();
    }

    @Test
    public void getType() throws Exception {
        mDayOfWeek.setType("getType");
        assertTrue("getType", mDayOfWeek.getType() == "getType");
    }

    @Test
    public void setType() throws Exception {
        mDayOfWeek.setType("getType");
        assertTrue("setType", mDayOfWeek.getType() == "getType");
    }

    @Test
    public void getMissing() throws Exception {
        mDayOfWeek.setMissing(1);
        assertTrue("getMissing", mDayOfWeek.getMissing() == 1);
    }

    @Test
    public void setMissing() throws Exception {
        mDayOfWeek.setMissing(2);
        assertTrue("setMissing", mDayOfWeek.getMissing() == 2);
    }

    @Test
    public void getTotal() throws Exception {
        mDayOfWeek.setTotal(2);
        assertTrue("getTotal", mDayOfWeek.getTotal() == 2);
    }

    @Test
    public void setTotal() throws Exception {
        mDayOfWeek.setTotal(2);
        assertTrue("setTotal", mDayOfWeek.getTotal() == 2);
    }

    @Test
    public void getOther() throws Exception {
        mDayOfWeek.setOther(2);
        assertTrue("getOther", mDayOfWeek.getOther() == 2);
    }

    @Test
    public void setOther() throws Exception {
        mDayOfWeek.setOther(2);
        assertTrue("setOther", mDayOfWeek.getOther() == 2);
    }

    @Test
    public void getTerms() throws Exception {
        List<Term> termList = new ArrayList<>();
        termList.add(new Term());
        mDayOfWeek.setTerms(termList);
        assertTrue("getTerms", mDayOfWeek.getTerms() == termList);
    }

    @Test
    public void setTerms() throws Exception {
        List<Term> termList1 = new ArrayList<>();
        termList1.add(new Term());
        mDayOfWeek.setTerms(termList1);
        assertTrue("setTerms", mDayOfWeek.getTerms() == termList1);
    }

}