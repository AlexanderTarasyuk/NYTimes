package com.nytimes.alex.mynews.Utils;

import java.util.concurrent.TimeUnit;

import com.nytimes.alex.mynews.Models.ArticleSearch.ArticleSearch;
import com.nytimes.alex.mynews.Models.MostPopular.MostPopular;
import com.nytimes.alex.mynews.Models.TopStories.TopStories;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;



public class NYTStreams {

    public static Observable<TopStories> streamFetchTopStories(String section){
        NYTService nytService = NYTService.retrofit.create(NYTService.class);
        return nytService.getTopStories(section)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public static Observable<MostPopular> streamFetchMostPopular(String section){
        NYTService nytService = NYTService.retrofit.create(NYTService.class);
        return nytService.getMostPopular(section)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public Observable<TopStories> streamFetchBusinessTopStories(){
        NYTService nytService = NYTService.retrofit.create(NYTService.class);
        return nytService.getTopStories("business")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }

    public static Observable<ArticleSearch> streamFetchArticleSearch(String query, String beginDate, String endDate, String newsDesk, String apiKey){
        NYTService nytService = NYTService.retrofit.create(NYTService.class);
        return nytService.getArticleSearch(query, beginDate, endDate, newsDesk, apiKey)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .timeout(10, TimeUnit.SECONDS);
    }
}