package com.nytimes.alex.mynews.Controllers.Activities;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.nytimes.alex.mynews.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mMainActivityActivityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);
    // Test if the activity is created
    @Test
    public void creationTest() throws Exception {
        onView(withId(R.id.activity_main_drawer_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void toolBarDisplayTest() throws Exception {
        onView(withId(R.id.activity_main_toolbar)).perform(click());
    }

    @Test
    public void menuDisplayTest() throws Exception {
        onView(withId(R.id.menu_activity_main_search)).perform(click());
        onView(withId(R.id.activity_search_toolbar)).check(matches(isDisplayed()));
    }

    // -----------------------
    // BusinessFragment tests
    // -----------------------

    @Test
    public void isBusinessFragmentShowing() throws Exception {
        onView(withId(R.id.activity_main_viewpager)).perform(swipeLeft());
        onView(withId(R.id.activity_main_viewpager)).perform(swipeLeft());
        onView(withId(R.id.fragment_business_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void isBusinessTabDisplayed() throws Exception {
        onView(withText("BUSINESS")).perform(click());
        onView(withId(R.id.fragment_business_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void businessRecyclerViewTest() throws Exception {
        onView(withText("BUSINESS")).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.fragment_business_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.activity_web_layout)).check(matches(isDisplayed()));
        Espresso.pressBack();
    }

    // --------------------------
    // MostPopularFragment tests
    // --------------------------

    @Test
    public void isMostPopularFragmentShowing() throws Exception {
        onView(withId(R.id.activity_main_viewpager)).perform(swipeLeft());
        onView(withId(R.id.fragment_most_popular_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void isMostPopularTabDisplayed() throws Exception {
        onView(withText("MOST POPULAR")).perform(click());
        onView(withId(R.id.fragment_most_popular_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void mostPopularRecyclerViewTest() throws Exception {
        onView(withText("MOST POPULAR")).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.fragment_most_popular_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.activity_web_webview)).check(matches(isDisplayed()));
        Espresso.pressBack();
    }

    // --------------------------
    // TopStoriesFragment tests
    // --------------------------

    @Test
    public void isTopStoriesFragmentShowing() throws Exception {
        onView(withId(R.id.activity_main_viewpager)).perform(swipeLeft());
        onView(withId(R.id.activity_main_viewpager)).perform(swipeRight());
        onView(withId(R.id.fragment_top_stories_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void isTopStoriesTabDisplayed() throws Exception {
        onView(withText("TOP STORIES")).perform(click());
        onView(withId(R.id.fragment_top_stories_swipe_container)).check(matches(isDisplayed()));
    }

    @Test
    public void topStoriesRecyclerViewTest() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.fragment_top_stories_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.activity_web_webview)).check(matches(isDisplayed()));
        Espresso.pressBack();
    }
}