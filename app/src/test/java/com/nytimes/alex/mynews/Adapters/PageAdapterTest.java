package com.nytimes.alex.mynews.Adapters;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.nytimes.alex.mynews.BuildConfig;
import com.nytimes.alex.mynews.Controllers.Fragments.BusinessFragment;
import com.nytimes.alex.mynews.Controllers.Fragments.MostPopularFragment;
import com.nytimes.alex.mynews.Controllers.Fragments.TopStoriesFragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.matches;
import static org.mockito.Mockito.mock;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class PageAdapterTest {
    FragmentManager mFragmentManager;
    PageAdapter mPageAdapter;

    @Before
    public void setUp() throws Exception {
        mFragmentManager = mock(FragmentManager.class);
        mPageAdapter = new PageAdapter(mFragmentManager);
    }

    @Test
    public void getTopStoriesItem() throws Exception {
        Fragment topStoriesItem = mPageAdapter.getItem(0);
        startFragment(topStoriesItem);
        assertNotNull(topStoriesItem);
        assertTrue(topStoriesItem instanceof TopStoriesFragment);
    }

    @Test
    public void getMostPopularItem() throws Exception {
        Fragment mostPopularItem = mPageAdapter.getItem(1);
        startFragment(mostPopularItem);
        assertNotNull(mostPopularItem);
        assertTrue(mostPopularItem instanceof MostPopularFragment);
    }

    @Test
    public void getBusinessItem() throws Exception {
        Fragment businessItem = mPageAdapter.getItem(2);
        startFragment(businessItem);
        assertNotNull(businessItem);
        assertTrue(businessItem instanceof BusinessFragment);
    }

    @Test
    public void getDefaultItem() throws Exception {
        assertEquals(null, mPageAdapter.getItem(3));
    }

    @Test
    public void countViews() throws Exception {
        assertEquals(3, mPageAdapter.getCount());
    }

    @Test
    public void getTopStoriesTitle() throws Exception {
        assertEquals("TOP STORIES", mPageAdapter.getPageTitle(0));
    }

    @Test
    public void getMostPopularTitle() throws Exception {
        assertEquals("MOST POPULAR", mPageAdapter.getPageTitle(1));
    }

    @Test
    public void getBusinessTitle() throws Exception {
        assertEquals("BUSINESS", mPageAdapter.getPageTitle(2));
    }

    @Test
    public void getDefaultTitle() throws Exception {
        assertEquals("COUCOU !", mPageAdapter.getPageTitle(3));
    }
}