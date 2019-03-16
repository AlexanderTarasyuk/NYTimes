package com.nytimes.alex.mynews.Models.MostPopular;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class MostPopularMediumTest {
        MostPopularMedium mMostPopularMedium;

        @Before
        public void initMultimedium(){
            mMostPopularMedium = new MostPopularMedium();
        }

        @Test
        public void getType() throws Exception {
            mMostPopularMedium.setType("image");

            assertTrue("getType", mMostPopularMedium.getType() == "image");
        }

        @Test
        public void setType() throws Exception {
            mMostPopularMedium.setType("video");

            assertTrue("setType", mMostPopularMedium.getType() == "video");
        }

        @Test
        public void getSubtype() throws Exception {
            mMostPopularMedium.setSubtype("photo");

            assertTrue("getSubtype", mMostPopularMedium.getSubtype() == "photo");
        }

        @Test
        public void setSubtype() throws Exception {
            mMostPopularMedium.setSubtype("gif");

            assertTrue("setSubtype", mMostPopularMedium.getSubtype() == "gif");
        }

        @Test
        public void getCaption() throws Exception {
            mMostPopularMedium.setCaption("Toto");

            assertTrue("getCaption", mMostPopularMedium.getCaption() == "Toto");
        }

        @Test
        public void setCaption() throws Exception {
            mMostPopularMedium.setCaption("Titi");

            assertTrue("setCaption", mMostPopularMedium.getCaption() == "Titi");
        }

        @Test
        public void getCopyright() throws Exception {
            mMostPopularMedium.setCopyright("TEZ");

            assertTrue("getCopyright", mMostPopularMedium.getCopyright() == "TEZ");
        }

        @Test
        public void setCopyright() throws Exception {
            mMostPopularMedium.setCopyright("MAVERICK");

            assertTrue("setCopyright", mMostPopularMedium.getCopyright() == "MAVERICK");
        }

        @Test
        public void getApprovedForSyndication() throws Exception {
            mMostPopularMedium.setApprovedForSyndication(1);

            assertTrue("getApprovedForSyndication", mMostPopularMedium.getApprovedForSyndication() == 1);
        }

        @Test
        public void setApprovedForSyndication() throws Exception {
            mMostPopularMedium.setApprovedForSyndication(2);

            assertTrue("setApprovedForSyndication", mMostPopularMedium.getApprovedForSyndication() == 2);
        }

        @Test
        public void getMediaMetadata() throws Exception {
            List<MostPopularMetadatum> mostPopularMetadatum = new ArrayList<>();
            mostPopularMetadatum.add(new MostPopularMetadatum());
            mMostPopularMedium.setMediaMetadata(mostPopularMetadatum);

            assertTrue("getMediaMetadata", mMostPopularMedium.getMediaMetadata() == mostPopularMetadatum);
        }

        @Test
        public void setMediaMetadata() throws Exception {
            List<MostPopularMetadatum> mostPopularMetadatum2 = new ArrayList<>();
            mostPopularMetadatum2.add(new MostPopularMetadatum());
            mMostPopularMedium.setMediaMetadata(mostPopularMetadatum2);

            assertTrue("setMediaMetadata", mMostPopularMedium.getMediaMetadata() == mostPopularMetadatum2);
        }
}