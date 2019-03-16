package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MultimediumTest {
    Multimedium mMultimedium;
    @Before
    public void initMultimedium(){
        mMultimedium = new Multimedium();
    }

    @Test
    public void getUrl() throws Exception {
        mMultimedium.setUrl("getUrl");
        assertTrue("getUrl", mMultimedium.getUrl() == "getUrl");
    }

    @Test
    public void setUrl() throws Exception {
        mMultimedium.setUrl("getUrl");
        assertTrue("setUrl", mMultimedium.getUrl() == "getUrl");
    }

    @Test
    public void getSubtype() throws Exception {
        mMultimedium.setSubtype("getSubtype");
        assertTrue("getSubtype", mMultimedium.getSubtype() == "getSubtype");
    }

    @Test
    public void setSubtype() throws Exception {
        mMultimedium.setSubtype("setSubtype");
        assertTrue("setSubtype", mMultimedium.getSubtype() == "setSubtype");
    }

    @Test
    public void getLegacy() throws Exception {
        Legacy legacy = new Legacy();
        mMultimedium.setLegacy(legacy);
        assertTrue("getLegacy", mMultimedium.getLegacy() == legacy);
    }

    @Test
    public void setLegacy() throws Exception {
        Legacy legacy2 = new Legacy();
        mMultimedium.setLegacy(legacy2);
        assertTrue("setLegacy", mMultimedium.getLegacy() == legacy2);
    }

    @Test
    public void getType() throws Exception {
        mMultimedium.setType("getType");
        assertTrue("getType", mMultimedium.getType() == "getType");
    }

    @Test
    public void setType() throws Exception {
        mMultimedium.setType("getType");
        assertTrue("setType", mMultimedium.getType() == "getType");
    }

    @Test
    public void getHeight() throws Exception {
        mMultimedium.setHeight(1);
        assertTrue("getHeight", mMultimedium.getHeight() == 1);
    }

    @Test
    public void setHeight() throws Exception {
        mMultimedium.setHeight(2);
        assertTrue("setHeight", mMultimedium.getHeight() == 2);
    }

    @Test
    public void getWidth() throws Exception {
        mMultimedium.setWidth(1);
        assertTrue("getWidth", mMultimedium.getWidth() == 1);
    }

    @Test
    public void setWidth() throws Exception {
        mMultimedium.setWidth(2);
        assertTrue("setWidth", mMultimedium.getWidth() == 2);
    }

}