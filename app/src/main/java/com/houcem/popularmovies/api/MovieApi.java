package com.houcem.popularmovies.api;

public interface MovieApi {

    @GET("search/tweets.json")
    Flowable<SearchResponse> searchTweets(@Query("q") String query);

    @GET("trends/place.json")
    Observable<List<TrendsResponse>> getTrends(@Query("id") String placeId);
}
