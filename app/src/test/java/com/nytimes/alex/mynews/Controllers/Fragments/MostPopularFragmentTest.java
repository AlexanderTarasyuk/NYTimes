package com.nytimes.alex.mynews.Controllers.Fragments;



import android.support.v4.app.Fragment;

import com.nytimes.alex.mynews.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MostPopularFragmentTest {

    @Test
    public void shouldNotBeNull() throws Exception {
        Fragment mostPopularFragment = MostPopularFragment.newInstance();
        startFragment(mostPopularFragment);
        assertNotNull(mostPopularFragment);
    }

}