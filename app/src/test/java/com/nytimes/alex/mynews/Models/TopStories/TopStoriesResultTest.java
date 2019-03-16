package com.nytimes.alex.mynews.Models.TopStories;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class TopStoriesResultTest {
    TopStoriesResult mTopStoriesResult;

    @Before
    public void initResult(){
        mTopStoriesResult = new TopStoriesResult();
    }

    @Test
    public void getSection() throws Exception {
        mTopStoriesResult.setSection("U.S");

        assertTrue("getSection", mTopStoriesResult.getSection() == "U.S");
    }

    @Test
    public void setSection() throws Exception {
        mTopStoriesResult.setSection("France");

        assertTrue("setSection", mTopStoriesResult.getSection() == "France");
    }

    @Test
    public void getSubsection() throws Exception {
        mTopStoriesResult.setSubsection("Politics");

        assertTrue("getSubsection", mTopStoriesResult.getSubsection() == "Politics");
    }

    @Test
    public void setSubsection() throws Exception {
        mTopStoriesResult.setSubsection("Economy");

        assertTrue("setSubsection", mTopStoriesResult.getSubsection() == "Economy");
    }

    @Test
    public void getTitle() throws Exception {
        mTopStoriesResult.setTitle("Hello World");

        assertTrue("getTitle", mTopStoriesResult.getTitle() == "Hello World");
    }

    @Test
    public void setTitle() throws Exception {
        mTopStoriesResult.setTitle("Bonjour le monde");

        assertTrue("setTitle", mTopStoriesResult.getTitle() == "Bonjour le monde");
    }

    @Test
    public void getAbstract() throws Exception {
        mTopStoriesResult.setAbstract("getAbstract");

        assertTrue("getAbstract", mTopStoriesResult.getAbstract() == "getAbstract");
    }

    @Test
    public void setAbstract() throws Exception {
        mTopStoriesResult.setAbstract("setAbstract");

        assertTrue("setAbstract", mTopStoriesResult.getAbstract() == "setAbstract");
    }

    @Test
    public void getUrl() throws Exception {
        mTopStoriesResult.setUrl("http://www.test.com");

        assertTrue("getUrl", mTopStoriesResult.getUrl() == "http://www.test.com");
    }

    @Test
    public void setUrl() throws Exception {
        mTopStoriesResult.setUrl("http://www.github.com/Te-Z");

        assertTrue("setUrl", mTopStoriesResult.getUrl() == "http://www.github.com/Te-Z");
    }

    @Test
    public void getByline() throws Exception {
        mTopStoriesResult.setByline("By TeZ");

        assertTrue("getByline", mTopStoriesResult.getByline() == "By TeZ");
    }

    @Test
    public void setByline() throws Exception {
        mTopStoriesResult.setByline("ZeT yB");

        assertTrue("setByline", mTopStoriesResult.getByline() == "ZeT yB");
    }

    @Test
    public void getItemType() throws Exception {
        mTopStoriesResult.setItemType("Article");

        assertTrue("getItemType", mTopStoriesResult.getItemType() == "Article");
    }

    @Test
    public void setItemType() throws Exception {
        mTopStoriesResult.setItemType("Blog");

        assertTrue("setItemType", mTopStoriesResult.getItemType() == "Blog");
    }

    @Test
    public void getUpdatedDate() throws Exception {
        mTopStoriesResult.setUpdatedDate("17-02-2018");

        assertTrue("getUpdatedDate", mTopStoriesResult.getUpdatedDate() == "17-02-2018");
    }

    @Test
    public void setUpdatedDate() throws Exception {
        mTopStoriesResult.setUpdatedDate("21-12-2012");

        assertTrue("setUpdatedDate", mTopStoriesResult.getUpdatedDate() == "21-12-2012");
    }

    @Test
    public void getCreatedDate() throws Exception {
        mTopStoriesResult.setCreatedDate("21-12-2012");

        assertTrue("getCreatedDate", mTopStoriesResult.getCreatedDate() == "21-12-2012");
    }

    @Test
    public void setCreatedDate() throws Exception {
        mTopStoriesResult.setCreatedDate("21-12-2012");

        assertTrue("setCreatedDate", mTopStoriesResult.getCreatedDate() == "21-12-2012");
    }

    @Test
    public void getPublishedDate() throws Exception {
        mTopStoriesResult.setPublishedDate("21-12-2012");

        assertTrue("getPublishedDate", mTopStoriesResult.getPublishedDate() == "21-12-2012");
    }

    @Test
    public void setPublishedDate() throws Exception {
        mTopStoriesResult.setPublishedDate("21-12-2012");

        assertTrue("setPublishedDate", mTopStoriesResult.getPublishedDate() == "21-12-2012");
    }

    @Test
    public void getMaterialTypeFacet() throws Exception {
        mTopStoriesResult.setMaterialTypeFacet("");

        assertTrue("getMaterialTypeFacet", mTopStoriesResult.getMaterialTypeFacet() == "");
    }

    @Test
    public void setMaterialTypeFacet() throws Exception {
        mTopStoriesResult.setMaterialTypeFacet("Kamoulox");

        assertTrue("setMaterialTypeFacet", mTopStoriesResult.getMaterialTypeFacet() == "Kamoulox");
    }

    @Test
    public void getKicker() throws Exception {
        mTopStoriesResult.setKicker("Consonne");

        assertTrue("getKicker", mTopStoriesResult.getKicker() == "Consonne");
    }

    @Test
    public void setKicker() throws Exception {
        mTopStoriesResult.setKicker("Voyelles");

        assertTrue("setKicker", mTopStoriesResult.getKicker() == "Voyelles");
    }

    @Test
    public void getDesFacet() throws Exception {
        List<String> backstreetBoys = new ArrayList<>();
        backstreetBoys.add("Brian Littrell");
        backstreetBoys.add("Nick Carter");
        backstreetBoys.add("Kevin Richardson");
        backstreetBoys.add("Howie Dorough");
        backstreetBoys.add("A. J. McLean");

        mTopStoriesResult.setDesFacet(backstreetBoys);

        assertTrue("setDesFacet", mTopStoriesResult.getDesFacet() == backstreetBoys);
    }

    @Test
    public void setDesFacet() throws Exception {
        List<String> twoBeThree = new ArrayList<>();
        twoBeThree.add("Adel Kachermi");
        twoBeThree.add("Filip Nikolic");
        twoBeThree.add("Frank Delay");

        mTopStoriesResult.setDesFacet(twoBeThree);

        assertTrue("setDesFacet", mTopStoriesResult.getDesFacet() == twoBeThree);
    }

    @Test
    public void getOrgFacet() throws Exception {
        Object pen = new Object();
        List<Object> pencilCase = new ArrayList<>();
        pencilCase.add(pen);

        mTopStoriesResult.setOrgFacet(pencilCase);

        assertTrue("getOrgFacet", mTopStoriesResult.getOrgFacet() == pencilCase);
    }

    @Test
    public void setOrgFacet() throws Exception {
        Object ball = new Object();
        List<Object> bag = new ArrayList<>();
        bag.add(ball);

        mTopStoriesResult.setOrgFacet(bag);

        assertTrue("setOrgFacet", mTopStoriesResult.getOrgFacet() == bag);
    }

    @Test
    public void getPerFacet() throws Exception {
        List<String> nsync = new ArrayList<>();
        nsync.add("Justin Timberlake");
        nsync.add("JC Chasez");
        nsync.add("Joey Fatone");
        nsync.add("Chris Kirkpatrick");
        nsync.add("Lance Bass");

        mTopStoriesResult.setPerFacet(nsync);

        assertTrue("getPerFacet", mTopStoriesResult.getPerFacet() == nsync);
    }

    @Test
    public void setPerFacet() throws Exception {
        List<String> alliage = new ArrayList<>();
        alliage.add("Quentin Elias");
        alliage.add("Steven Gunnell");
        alliage.add("Roman Lata Ares");
        alliage.add("Brian Torres");

        mTopStoriesResult.setPerFacet(alliage);

        assertTrue("setPerFacet", mTopStoriesResult.getPerFacet() == alliage);
    }

    @Test
    public void getGeoFacet() throws Exception {
        List<String> russia = new ArrayList<>();
        russia.add("moscow");

        mTopStoriesResult.setGeoFacet(russia);

        assertTrue("getGeoFacet", mTopStoriesResult.getGeoFacet() == russia);
    }

    @Test
    public void setGeoFacet() throws Exception {
        List<String> usa = new ArrayList<>();
        usa.add("washington");

        mTopStoriesResult.setGeoFacet(usa);

        assertTrue("setGeoFacet", mTopStoriesResult.getGeoFacet() == usa);
    }

    @Test
    public void getMultimedia() throws Exception {
        List<TopStoriesMultimedium> topStoriesMultimediumList = new ArrayList<>();
        topStoriesMultimediumList.add(new TopStoriesMultimedium());

        mTopStoriesResult.setMultimedia(topStoriesMultimediumList);

        assertTrue("getMultimedia", mTopStoriesResult.getMultimedia() == topStoriesMultimediumList);
    }

    @Test
    public void setMultimedia() throws Exception {
        List<TopStoriesMultimedium> topStoriesMultimediumList2 = new ArrayList<>();
        topStoriesMultimediumList2.add(new TopStoriesMultimedium());

        mTopStoriesResult.setMultimedia(topStoriesMultimediumList2);

        assertTrue("setMultimedia", mTopStoriesResult.getMultimedia() == topStoriesMultimediumList2);
    }

    @Test
    public void getShortUrl() throws Exception {
        String shortUrl = new String("http://www.soshort.com");

        mTopStoriesResult.setShortUrl(shortUrl);

        assertTrue("getShortUrl", mTopStoriesResult.getShortUrl() == shortUrl);

    }

    @Test
    public void setShortUrl() throws Exception {
        String shortyshortUrl = new String("http://www.soshortyshort.com");

        mTopStoriesResult.setShortUrl(shortyshortUrl);

        assertTrue("setShortUrl", mTopStoriesResult.getShortUrl() == shortyshortUrl);
    }

}