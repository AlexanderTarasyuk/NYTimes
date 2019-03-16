package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class BylineTest {
    Byline mByline;

    @Before
    public void setUp() throws Exception {
        mByline = new Byline();
    }

    @Test
    public void getPerson() throws Exception {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
        mByline.setPerson(personList);

        assertTrue("getPerson()", mByline.getPerson() == personList);
    }

    @Test
    public void setPerson() throws Exception {
        List<Person> personList1 = new ArrayList<>();
        personList1.add(new Person());
        mByline.setPerson(personList1);

        assertTrue("setPerson()", mByline.getPerson() == personList1);
    }

    @Test
    public void getOriginal() throws Exception {
        mByline.setOriginal("getOriginal");
        assertTrue("getOriginal", mByline.getOriginal() == "getOriginal");
    }

    @Test
    public void setOriginal() throws Exception {
        mByline.setOriginal("setOriginal");
        assertTrue("setOriginal", mByline.getOriginal() == "setOriginal");
    }

}