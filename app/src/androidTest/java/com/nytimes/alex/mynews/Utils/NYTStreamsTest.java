package com.nytimes.alex.mynews.Utils;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.nytimes.alex.mynews.Models.ArticleSearch.ArticleSearch;
import com.nytimes.alex.mynews.Models.MostPopular.MostPopular;
import com.nytimes.alex.mynews.Models.TopStories.TopStories;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.reactivex.Observable;
import io.reactivex.observers.TestObserver;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class NYTStreamsTest {
    @Test
    public void streamTest() {
        // Get the stream
        Observable<TopStories> topStoriesObservable = NYTStreams.streamFetchTopStories("home");
        // Create a new TestObserver
        TestObserver<TopStories> testObserver = new TestObserver<>();
        // Launch observable
        topStoriesObservable.subscribeWith(testObserver)
                .assertNoErrors() // Check if no errors
                .assertNoTimeout() // Check if no timeout
                .awaitTerminalEvent(); // Avait the stream terminated before continue

        // Get fetched top stories
        String copyrightValues = testObserver.values().toString();
        Log.e("copyrightValues", "return: "+copyrightValues);
        String copyright = testObserver.values().get(0).getCopyright();
        Log.e("Copyright", "return: "+copyright);
        String original = "Copyright (c) 2018 The New York Times Company. All Rights Reserved.";
        Log.e("Copyright", "return: "+original.length());
        for (int i = 0; i < copyright.length(); i++){
            Log.e("Char", "Copyright: "+copyright.charAt(i)+"\nOriginal: "+original.charAt(i));
            assertEquals(original.charAt(i), copyright.charAt(i));
        }

        // ----------------------
        // Business Top Stories
        // ----------------------

        NYTStreams nytStreams = new NYTStreams();
        // Get the stream
        topStoriesObservable = nytStreams.streamFetchBusinessTopStories();
        // Create a new TestObserver
        testObserver = new TestObserver<>();
        // Launch observable

        topStoriesObservable.subscribeWith(testObserver).awaitTerminalEvent(); // Await the stream terminated before continue

        // Get fetched top stories
        copyright = testObserver.values().get(0).getCopyright();
        Log.e("Copyright", "return: "+copyright.length());
        original = "Copyright (c) 2018 The New York Times Company. All Rights Reserved.";
        Log.e("Copyright", "return: "+original.length());
        for (int i = 0; i < copyright.length(); i++){
            Log.e("Char", "Copyright: "+copyright.charAt(i)+"\nOriginal: "+original.charAt(i));
            assertEquals(original.charAt(i), copyright.charAt(i));
        }

        // ----------------------
        // Most Popular Stories
        // ----------------------

        // Get the stream
        Observable<MostPopular> mostPopularObservable = NYTStreams.streamFetchMostPopular("all-sections");
        // Create a new TestObserver
        TestObserver<MostPopular> testObserver1 = new TestObserver<>();
        // Launch observable
        mostPopularObservable.subscribeWith(testObserver1)
                .assertNoErrors() // Check if no errors
                .assertNoTimeout() // Check if no timeout
                .awaitTerminalEvent(); // Avait the stream terminated before continue

        // Get fetched top stories
        copyright = testObserver1.values().get(0).getCopyright();
        Log.e("Copyright", "return: "+copyright.length());
        original = "Copyright (c) 2018 The New York Times Company.  All Rights Reserved.";
        Log.e("Copyright", "return: "+original.length());
        for (int i = 0; i < copyright.length(); i++){
            Log.e("Char", "Copyright: "+copyright.charAt(i)+"\nOriginal: "+original.charAt(i));
            assertEquals(original.charAt(i), copyright.charAt(i));
        }

        // ----------------------
        // Article Search
        // ----------------------

        // Get the stream
        Observable<ArticleSearch> articleSearchObservable = NYTStreams.streamFetchArticleSearch("trump", "", "", "news_desk(\"\")", "45f44030dcab4a4cacdefd4dd7418bfa");
        // Create a new TestObserver
        TestObserver<ArticleSearch> testObserver2 = new TestObserver<>();
        // Launch observable
        articleSearchObservable.subscribeWith(testObserver2)
                .assertNoErrors() // Check if no errors
                .assertNoTimeout() // Check if no timeout
                .awaitTerminalEvent(); // Avait the stream terminated before continue

        // Get fetched top stories
        copyright = testObserver.values().get(0).getCopyright();
        Log.e("Copyright", "return: "+copyright.length());
        original = "Copyright (c) 2018 The New York Times Company. All Rights Reserved.";
        Log.e("Copyright", "return: "+original.length());
        for (int i = 0; i < copyright.length(); i++){
            Log.e("Char", "Copyright: "+copyright.charAt(i)+"\nOriginal: "+original.charAt(i));
            assertTrue("Copyright char at index n°"+i, copyright.charAt(i) == original.charAt(i));
        }
    }

}