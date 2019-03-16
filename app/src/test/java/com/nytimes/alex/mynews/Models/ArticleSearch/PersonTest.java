package com.nytimes.alex.mynews.Models.ArticleSearch;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class PersonTest {
    Person mPerson;
    @Before
    public void setUp() throws Exception {
        mPerson = new Person();
    }

    @Test
    public void getOrganization() throws Exception {
        mPerson.setOrganization("getOrganization");
        assertTrue("getOrganization", mPerson.getOrganization() == "getOrganization");
    }

    @Test
    public void setOrganization() throws Exception {
        mPerson.setOrganization("getOrganization");
        assertTrue("setOrganization", mPerson.getOrganization() == "getOrganization");
    }

    @Test
    public void getRole() throws Exception {
        mPerson.setRole("getRole");
        assertTrue("getRole", mPerson.getRole() == "getRole");
    }

    @Test
    public void setRole() throws Exception {
        mPerson.setRole("getRole");
        assertTrue("setRole", mPerson.getRole() == "getRole");
    }

    @Test
    public void getRank() throws Exception {
        mPerson.setRank(1);
        assertTrue("getRank", mPerson.getRank() == 1);
    }

    @Test
    public void setRank() throws Exception {
        mPerson.setRank(2);
        assertTrue("setRank", mPerson.getRank() == 2);
    }

    @Test
    public void getFirstname() throws Exception {
        mPerson.setFirstname("getFirstname");
        assertTrue("getFirstname", mPerson.getFirstname() == "getFirstname");
    }

    @Test
    public void setFirstname() throws Exception {
        mPerson.setFirstname("getFirstname");
        assertTrue("setFirstname", mPerson.getFirstname() == "getFirstname");
    }

    @Test
    public void getMiddlename() throws Exception {
        mPerson.setMiddlename("getMiddlename");
        assertTrue("getMiddlename", mPerson.getMiddlename() == "getMiddlename");
    }

    @Test
    public void setMiddlename() throws Exception {
        mPerson.setMiddlename("getMiddlename");
        assertTrue("setMiddlename", mPerson.getMiddlename() == "getMiddlename");
    }

    @Test
    public void getLastname() throws Exception {
        mPerson.setLastname("getLastname");
        assertTrue("getLastname", mPerson.getLastname() == "getLastname");
    }

    @Test
    public void setLastname() throws Exception {
        mPerson.setLastname("getLastname");
        assertTrue("setLastname", mPerson.getLastname() == "getLastname");
    }

}