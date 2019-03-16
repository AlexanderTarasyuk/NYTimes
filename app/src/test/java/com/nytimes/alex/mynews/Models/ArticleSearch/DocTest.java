package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class DocTest {
    Doc mDoc;

    @Before
    public void setUp() throws Exception {
        mDoc = new Doc();
    }

    @Test
    public void getWebUrl() throws Exception {
        mDoc.setWebUrl("getWebUrl");
        assertTrue("getWebUrl", mDoc.getWebUrl() == "getWebUrl");
    }

    @Test
    public void setWebUrl() throws Exception {
        mDoc.setWebUrl("setWebUrl");
        assertTrue("setWebUrl", mDoc.getWebUrl() == "setWebUrl");
    }

    @Test
    public void getSnippet() throws Exception {
        mDoc.setSnippet("getSnippet");
        assertTrue("getSnippet", mDoc.getSnippet() == "getSnippet");
    }

    @Test
    public void setSnippet() throws Exception {
        mDoc.setSnippet("setSnippet");
        assertTrue("setSnippet", mDoc.getSnippet() == "setSnippet");
    }

    @Test
    public void getLeadParagraph() throws Exception {
        mDoc.setLeadParagraph("getLeadParagraph");
        assertTrue("getLeadParagraph", mDoc.getLeadParagraph() == "getLeadParagraph");
    }

    @Test
    public void setLeadParagraph() throws Exception {
        mDoc.setLeadParagraph("setLeadParagraph");
        assertTrue("setLeadParagraph", mDoc.getLeadParagraph() == "setLeadParagraph");
    }

    @Test
    public void getAbstract() throws Exception {
        mDoc.setAbstract("getAbstract");
        assertTrue("getAbstract", mDoc.getAbstract() == "getAbstract");
    }

    @Test
    public void setAbstract() throws Exception {
        mDoc.setAbstract("setAbstract");
        assertTrue("setAbstract", mDoc.getAbstract() == "setAbstract");
    }

    @Test
    public void getPrintPage() throws Exception {
        mDoc.setPrintPage("getPrintPage");
        assertTrue("getPrintPage", mDoc.getPrintPage() == "getPrintPage");
    }

    @Test
    public void setPrintPage() throws Exception {
        mDoc.setPrintPage("setPrintPage");
        assertTrue("setPrintPage", mDoc.getPrintPage() == "setPrintPage");
    }

    @Test
    public void getSource() throws Exception {
        mDoc.setSource("getSource");
        assertTrue("getSource", mDoc.getSource() == "getSource");
    }

    @Test
    public void setSource() throws Exception {
        mDoc.setSource("setSource");
        assertTrue("setSource", mDoc.getSource() == "setSource");
    }

    @Test
    public void getMultimedia() throws Exception {
        List<Multimedium> multimediumList = new ArrayList<>();
        multimediumList.add(new Multimedium());
        mDoc.setMultimedia(multimediumList);
        assertTrue("getMultimedia", mDoc.getMultimedia() == multimediumList);
    }

    @Test
    public void setMultimedia() throws Exception {
        List<Multimedium> multimediumList = new ArrayList<>();
        multimediumList.add(new Multimedium());
        mDoc.setMultimedia(multimediumList);
        assertTrue("setMultimedia", mDoc.getMultimedia() == multimediumList);
    }

    @Test
    public void getHeadline() throws Exception {
        Headline headline = new Headline();
        mDoc.setHeadline(headline);
        assertTrue("getHeadline", mDoc.getHeadline() == headline);
    }

    @Test
    public void setHeadline() throws Exception {
        Headline headline = new Headline();
        mDoc.setHeadline(headline);
        assertTrue("setHeadline", mDoc.getHeadline() == headline);
    }

    @Test
    public void getKeywords() throws Exception {
        List<Keyword> keywordList = new ArrayList<>();
        keywordList.add(new Keyword());
        mDoc.setKeywords(keywordList);
        assertTrue("getKeywords", mDoc.getKeywords() == keywordList);
    }

    @Test
    public void setKeywords() throws Exception {
        List<Keyword> keywordList = new ArrayList<>();
        keywordList.add(new Keyword());
        mDoc.setKeywords(keywordList);
        assertTrue("getKeywords", mDoc.getKeywords() == keywordList);
    }

    @Test
    public void getPubDate() throws Exception {
        mDoc.setPubDate("getPubDate");
        assertTrue("getPubDate", mDoc.getPubDate() == "getPubDate");
    }

    @Test
    public void setPubDate() throws Exception {
        mDoc.setPubDate("setPubDate");
        assertTrue("setPubDate", mDoc.getPubDate() == "setPubDate");
    }

    @Test
    public void getDocumentType() throws Exception {
        mDoc.setDocumentType("getDocumentType");
        assertTrue("getDocumentType", mDoc.getDocumentType() == "getDocumentType");
    }

    @Test
    public void setDocumentType() throws Exception {
        mDoc.setDocumentType("setDocumentType");
        assertTrue("setDocumentType", mDoc.getDocumentType() == "setDocumentType");
    }

    @Test
    public void getNewsDesk() throws Exception {
        mDoc.setNewsDesk("getNewsDesk");
        assertTrue("getNewsDesk", mDoc.getNewsDesk() == "getNewsDesk");
    }

    @Test
    public void setNewsDesk() throws Exception {
        mDoc.setNewsDesk("setNewsDesk");
        assertTrue("setNewsDesk", mDoc.getNewsDesk() == "setNewsDesk");
    }

    @Test
    public void getSectionName() throws Exception {
        mDoc.setSectionName("getSectionName");
        assertTrue("getSectionName", mDoc.getSectionName() == "getSectionName");
    }

    @Test
    public void setSectionName() throws Exception {
        mDoc.setSectionName("setSectionName");
        assertTrue("setSectionName", mDoc.getSectionName() == "setSectionName");
    }

    @Test
    public void getByline() throws Exception {
        Byline byline = new Byline();
        mDoc.setByline(byline);
        assertTrue("getByline", mDoc.getByline() == byline);
    }

    @Test
    public void setByline() throws Exception {
        Byline byline = new Byline();
        mDoc.setByline(byline);
        assertTrue("setByline", mDoc.getByline() == byline);
    }

    @Test
    public void getWordCount() throws Exception {
        mDoc.setWordCount(1);
        assertTrue("getWordCount", mDoc.getWordCount() == 1);
    }

    @Test
    public void setWordCount() throws Exception {
        mDoc.setWordCount(2);
        assertTrue("getWordCount", mDoc.getWordCount() == 2);
    }

    @Test
    public void getTypeOfMaterial() throws Exception {
        mDoc.setTypeOfMaterial("getTypeOfMaterial");
        assertTrue("getTypeOfMaterial", mDoc.getTypeOfMaterial() == "getTypeOfMaterial");
    }

    @Test
    public void setTypeOfMaterial() throws Exception {
        mDoc.setTypeOfMaterial("getTypeOfMaterial");
        assertTrue("setTypeOfMaterial", mDoc.getTypeOfMaterial() == "getTypeOfMaterial");
    }

    @Test
    public void getId() throws Exception {
        mDoc.setId("getId");
        assertTrue("getId", mDoc.getId() == "getId");
    }

    @Test
    public void setId() throws Exception {
        mDoc.setId("setId");
        assertTrue("setId", mDoc.getId() == "setId");
    }

}