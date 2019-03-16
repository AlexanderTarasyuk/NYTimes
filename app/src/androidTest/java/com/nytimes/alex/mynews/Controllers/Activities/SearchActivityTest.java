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
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class SearchActivityTest {

    @Rule
    public ActivityTestRule<SearchActivity> mSearchActivityActivityTestRule =
            new ActivityTestRule<SearchActivity>(SearchActivity.class);

    @Test
    public void creationTest() throws Exception {
        onView(withId(R.id.activity_search_toolbar)).check(matches(isDisplayed()));
        onView(withId(R.id.form_search_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void noQueryTermErrorTest() throws Exception {
        onView(withId(R.id.form_search_button)).perform(click());
        onView(withId(R.id.form_search_layout)).check(matches(isDisplayed()));
    }

    @Test
    public void checkboxesError() throws Exception {
        onView(withId(R.id.form_search_query)).perform(typeText("Trump"));
        Espresso.pressBack();
        onView(withId(R.id.form_search_button)).perform(click());
        onView(withId(R.id.form_search_warning_checkboxes)).check(matches(isDisplayed()));
    }

    @Test
    public void simpleSearchTest() throws Exception{
        onView(withId(R.id.form_search_query)).perform(typeText("Trump"));
        onView(withId(R.id.form_search_right_checkBox_politics)).perform(click());
        Espresso.pressBack();
        onView(withId(R.id.form_search_button)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.fragment_result_recycler_view)).check(matches(isDisplayed()));
    }

    @Test
    public void resultWebViewTest() throws Exception{
        onView(withId(R.id.form_search_query)).perform(typeText("Trump"));
        onView(withId(R.id.form_search_right_checkBox_politics)).perform(click());
        Espresso.pressBack();
        onView(withId(R.id.form_search_button)).perform(click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.fragment_result_recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(4, click()));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onView(withId(R.id.activity_web_layout)).check(matches(isDisplayed()));
    }
}