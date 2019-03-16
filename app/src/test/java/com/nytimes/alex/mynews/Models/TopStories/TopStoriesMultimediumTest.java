package com.nytimes.alex.mynews.Models.TopStories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TopStoriesMultimediumTest {
    TopStoriesMultimedium mTopStoriesMultimedium;

    @Before
    public void initMultimedium(){
        mTopStoriesMultimedium = new TopStoriesMultimedium();
    }

    @Test
    public void getUrl() throws Exception {
        mTopStoriesMultimedium.setUrl("http://www.test.com");

        String result = mTopStoriesMultimedium.getUrl();

        assertTrue("getUrl", result == "http://www.test.com");
    }

    @Test
    public void setUrl() throws Exception {
        mTopStoriesMultimedium.setUrl("http://www.test.fr");

        assertTrue("setUrl", mTopStoriesMultimedium.getUrl() == "http://www.test.fr");
    }

    @Test
    public void getFormat() throws Exception {
        mTopStoriesMultimedium.setFormat("Standard Thumbmail");

        assertTrue("getFormat", mTopStoriesMultimedium.getFormat() == "Standard Thumbmail");
    }

    @Test
    public void setFormat() throws Exception {
        mTopStoriesMultimedium.setFormat("Normal");

        assertTrue("setFormat", mTopStoriesMultimedium.getFormat() == "Normal");
    }

    @Test
    public void getHeight() throws Exception {
        mTopStoriesMultimedium.setHeight(12);

        assertTrue("getHeight", mTopStoriesMultimedium.getHeight() == 12);
    }

    @Test
    public void setHeight() throws Exception {
        mTopStoriesMultimedium.setHeight(66);

        assertTrue("setHeight", mTopStoriesMultimedium.getHeight() == 66);
    }

    @Test
    public void getWidth() throws Exception {
        mTopStoriesMultimedium.setWidth(55);

        assertTrue("getWidth", mTopStoriesMultimedium.getWidth() == 55);
    }

    @Test
    public void setWidth() throws Exception {
        mTopStoriesMultimedium.setWidth(77);

        assertTrue("setWidth", mTopStoriesMultimedium.getWidth() == 77);
    }

    @Test
    public void getType() throws Exception {
        mTopStoriesMultimedium.setType("image");

        assertTrue("getType", mTopStoriesMultimedium.getType() == "image");
    }

    @Test
    public void setType() throws Exception {
        mTopStoriesMultimedium.setType("video");

        assertTrue("setType", mTopStoriesMultimedium.getType() == "video");
    }

    @Test
    public void getSubtype() throws Exception {
        mTopStoriesMultimedium.setSubtype("photo");

        assertTrue("getSubtype", mTopStoriesMultimedium.getSubtype() == "photo");
    }

    @Test
    public void setSubtype() throws Exception {
        mTopStoriesMultimedium.setSubtype("gif");

        assertTrue("setSubtype", mTopStoriesMultimedium.getSubtype() == "gif");
    }

    @Test
    public void getCaption() throws Exception {
        mTopStoriesMultimedium.setCaption("Toto");

        assertTrue("getCaption", mTopStoriesMultimedium.getCaption() == "Toto");
    }

    @Test
    public void setCaption() throws Exception {
        mTopStoriesMultimedium.setCaption("Titi");

        assertTrue("setCaption", mTopStoriesMultimedium.getCaption() == "Titi");
    }

    @Test
    public void getCopyright() throws Exception {
        mTopStoriesMultimedium.setCopyright("TEZ");

        assertTrue("getCopyright", mTopStoriesMultimedium.getCopyright() == "TEZ");
    }

    @Test
    public void setCopyright() throws Exception {
        mTopStoriesMultimedium.setCopyright("MAVERICK");

        assertTrue("setCopyright", mTopStoriesMultimedium.getCopyright() == "MAVERICK");
    }

}