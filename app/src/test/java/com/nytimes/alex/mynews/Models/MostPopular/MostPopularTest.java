package com.nytimes.alex.mynews.Models.MostPopular;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class MostPopularTest {
    MostPopular mostPopular;

    @Before
    public void initmostPopular(){
        mostPopular = new MostPopular();
    }

    @Test
    public void getStatus() throws Exception {
        mostPopular.setStatus("OK");

        assertTrue("getStatus", mostPopular.getStatus() == "OK");
    }

    @Test
    public void setStatus() throws Exception {
        mostPopular.setStatus("Error 400");

        assertTrue("setStatus", mostPopular.getStatus() == "Error 400");
    }

    @Test
    public void getCopyright() throws Exception {
        mostPopular.setCopyright("TeZ");

        assertTrue("getCopyright", mostPopular.getCopyright() == "TeZ");
    }

    @Test
    public void setCopyright() throws Exception {
        mostPopular.setCopyright("ZeT");

        assertTrue("setCopyright", mostPopular.getCopyright() == "ZeT");
    }

    @Test
    public void getNumResults() throws Exception {
        mostPopular.setNumResults(50);

        assertTrue("getNumResults", mostPopular.getNumResults() == 50);
    }

    @Test
    public void setNumResults() throws Exception {
        mostPopular.setNumResults(10);

        assertTrue("setNumResults", mostPopular.getNumResults() == 10);
    }

    @Test
    public void getResults() throws Exception {
        List<MostPopularResult> mostPopularResults = new ArrayList<>();
        mostPopularResults.add(new MostPopularResult());

        mostPopular.setMostPopularResults(mostPopularResults);

        assertTrue("getMostPopularResults", mostPopular.getMostPopularResults() == mostPopularResults);
    }

    @Test
    public void setResults() throws Exception {
        List<MostPopularResult> results2 = new ArrayList<>();
        results2.add(new MostPopularResult());

        mostPopular.setMostPopularResults(results2);

        assertTrue("setMostPopularResults", mostPopular.getMostPopularResults() == results2);
    }

}