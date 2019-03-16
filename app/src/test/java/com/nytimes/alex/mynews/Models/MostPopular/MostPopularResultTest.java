package com.nytimes.alex.mynews.Models.MostPopular;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class MostPopularResultTest {
    MostPopularResult mMostPopularResult;

    @Before
    public void initResult(){
        mMostPopularResult = new MostPopularResult();
    }

    @Test//
    public void getSection() throws Exception {
        mMostPopularResult.setSection("U.S");

        assertTrue("getSection", mMostPopularResult.getSection() == "U.S");
    }

    @Test//
    public void setSection() throws Exception {
        mMostPopularResult.setSection("France");

        assertTrue("setSection", mMostPopularResult.getSection() == "France");
    }

    @Test//
    public void getTitle() throws Exception {
        mMostPopularResult.setTitle("Hello World");

        assertTrue("getTitle", mMostPopularResult.getTitle() == "Hello World");
    }

    @Test//
    public void setTitle() throws Exception {
        mMostPopularResult.setTitle("Bonjour le monde");

        assertTrue("setTitle", mMostPopularResult.getTitle() == "Bonjour le monde");
    }

    @Test//
    public void getAbstract() throws Exception {
        mMostPopularResult.setAbstract("getAbstract");

        assertTrue("getAbstract", mMostPopularResult.getAbstract() == "getAbstract");
    }

    @Test//
    public void setAbstract() throws Exception {
        mMostPopularResult.setAbstract("setAbstract");

        assertTrue("setAbstract", mMostPopularResult.getAbstract() == "setAbstract");
    }

    @Test//
    public void getUrl() throws Exception {
        mMostPopularResult.setUrl("http://www.test.com");

        assertTrue("getUrl", mMostPopularResult.getUrl() == "http://www.test.com");
    }

    @Test//
    public void setUrl() throws Exception {
        mMostPopularResult.setUrl("http://www.github.com/Te-Z");

        assertTrue("setUrl", mMostPopularResult.getUrl() == "http://www.github.com/Te-Z");
    }

    @Test//
    public void getByline() throws Exception {
        mMostPopularResult.setByline("By TeZ");

        assertTrue("getByline", mMostPopularResult.getByline() == "By TeZ");
    }

    @Test//
    public void setByline() throws Exception {
        mMostPopularResult.setByline("ZeT yB");

        assertTrue("setByline", mMostPopularResult.getByline() == "ZeT yB");
    }

    @Test//
    public void getPublishedDate() throws Exception {
        mMostPopularResult.setPublishedDate("21-12-2012");

        assertTrue("getPublishedDate", mMostPopularResult.getPublishedDate() == "21-12-2012");
    }

    @Test//
    public void setPublishedDate() throws Exception {
        mMostPopularResult.setPublishedDate("21-12-2012");

        assertTrue("setPublishedDate", mMostPopularResult.getPublishedDate() == "21-12-2012");
    }

    @Test
    public void getMultimedia() throws Exception {
        List<MostPopularMedium> mostPopularMediumList = new ArrayList<>();
        mostPopularMediumList.add(new MostPopularMedium());

        mMostPopularResult.setMultimedia(mostPopularMediumList);

        assertTrue("getMultimedia", mMostPopularResult.getMultimedia() == mostPopularMediumList);
    }

    @Test
    public void setMultimedia() throws Exception {
        List<MostPopularMedium> mostPopularMediumList2 = new ArrayList<>();
        mostPopularMediumList2.add(new MostPopularMedium());

        mMostPopularResult.setMultimedia(mostPopularMediumList2);

        assertTrue("setMultimedia", mMostPopularResult.getMultimedia() == mostPopularMediumList2);
    }

    @Test//
    public void getAdxKeywords() throws Exception {
        mMostPopularResult.setAdxKeywords("getAdxKeywords");

        assertTrue("getAdxKeywords", mMostPopularResult.getAdxKeywords() == "getAdxKeywords");
    }

    @Test//
    public void setAdxKeywords() throws Exception {
        mMostPopularResult.setAdxKeywords("setAdxKeywords");

        assertTrue("setAdxKeywords", mMostPopularResult.getAdxKeywords() == "setAdxKeywords");
    }

    @Test//
    public void getColumn() throws Exception {
        mMostPopularResult.setColumn("getColumn");

        assertTrue("getColumn", mMostPopularResult.getColumn() == "getColumn");
    }

    @Test//
    public void setColumn() throws Exception {
        mMostPopularResult.setColumn("setColumn");

        assertTrue("setColumn", mMostPopularResult.getColumn() == "setColumn");
    }

    @Test//
    public void getType() throws Exception {
        mMostPopularResult.setType("getType");

        assertTrue("getType", mMostPopularResult.getType() == "getType");
    }

    @Test//
    public void setType() throws Exception {
        mMostPopularResult.setType("setType");

        assertTrue("setType", mMostPopularResult.getType() == "setType");
    }

    @Test//
    public void getSource() throws Exception {
        mMostPopularResult.setSource("getSource");

        assertTrue("getSource", mMostPopularResult.getSource() == "getSource");
    }

    @Test//
    public void setSource() throws Exception {
        mMostPopularResult.setSource("setSource");

        assertTrue("setSource", mMostPopularResult.getSource() == "setSource");
    }

    @Test
    public void getAssetId() throws Exception {
        mMostPopularResult.setAssetId(1L);

        assertTrue("getAssetId", mMostPopularResult.getAssetId() == 1L);
    }

    @Test
    public void setAssetId() throws Exception {
        mMostPopularResult.setAssetId(2L);

        assertTrue("setAssetId", mMostPopularResult.getAssetId() == 2L);
    }

    @Test
    public void getViews() throws Exception {
        mMostPopularResult.setViews(1);

        assertTrue("getViews", mMostPopularResult.getViews() == 1);
    }

    @Test
    public void setViews() throws Exception {
        mMostPopularResult.setViews(2);

        assertTrue("setViews", mMostPopularResult.getViews() == 2);
    }

    @Test
    public void getId() throws Exception {
        mMostPopularResult.setId(1L);

        assertTrue("getId", mMostPopularResult.getId() == 1L);
    }

    @Test
    public void setId() throws Exception {
        mMostPopularResult.setId(2L);

        assertTrue("setId", mMostPopularResult.getId() == 2L);
    }
}