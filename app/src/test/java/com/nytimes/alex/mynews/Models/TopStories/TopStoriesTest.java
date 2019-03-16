package com.nytimes.alex.mynews.Models.TopStories;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class TopStoriesTest {
    TopStories topStories;

    @Before
    public void initTopStories(){
        topStories = new TopStories();
    }

    @Test
    public void getStatus() throws Exception {
        topStories.setStatus("OK");

        assertTrue("getStatus", topStories.getStatus() == "OK");
    }

    @Test
    public void setStatus() throws Exception {
        topStories.setStatus("Error 400");

        assertTrue("setStatus", topStories.getStatus() == "Error 400");
    }

    @Test
    public void getCopyright() throws Exception {
        topStories.setCopyright("TeZ");

        assertTrue("getCopyright", topStories.getCopyright() == "TeZ");
    }

    @Test
    public void setCopyright() throws Exception {
        topStories.setCopyright("ZeT");

        assertTrue("setCopyright", topStories.getCopyright() == "ZeT");
    }

    @Test
    public void getSection() throws Exception {
        topStories.setSection("Home");

        assertTrue("getSection", topStories.getSection() == "Home");
    }

    @Test
    public void setSection() throws Exception {
        topStories.setSection("World");

        assertTrue("setSection", topStories.getSection() == "World");
    }

    @Test
    public void getLastUpdated() throws Exception {
        topStories.setLastUpdated("today");

        assertTrue("getLastUpdated", topStories.getLastUpdated() == "today");
    }

    @Test
    public void setLastUpdated() throws Exception {
        topStories.setLastUpdated("tomorrow");

        assertTrue("setLastUpdated", topStories.getLastUpdated() == "tomorrow");
    }

    @Test
    public void getNumResults() throws Exception {
        topStories.setNumResults(50);

        assertTrue("getNumResults", topStories.getNumResults() == 50);
    }

    @Test
    public void setNumResults() throws Exception {
        topStories.setNumResults(10);

        assertTrue("setNumResults", topStories.getNumResults() == 10);
    }

    @Test
    public void getResults() throws Exception {
        List<TopStoriesResult> topStoriesResults = new ArrayList<>();
        topStoriesResults.add(new TopStoriesResult());

        topStories.setTopStoriesResults(topStoriesResults);

        assertTrue("getTopStoriesResults", topStories.getTopStoriesResults() == topStoriesResults);
    }

    @Test
    public void setResults() throws Exception {
        List<TopStoriesResult> topStoriesResult2 = new ArrayList<>();
        topStoriesResult2.add(new TopStoriesResult());

        topStories.setTopStoriesResults(topStoriesResult2);

        assertTrue("setTopStoriesResults", topStories.getTopStoriesResults() == topStoriesResult2);
    }

}