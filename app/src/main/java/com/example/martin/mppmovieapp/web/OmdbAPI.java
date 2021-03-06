package com.example.martin.mppmovieapp.web;

import com.example.martin.mppmovieapp.model.ApiSearchResult;
import com.example.martin.mppmovieapp.model.Movie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author martin
 */

public interface OmdbAPI {

    @GET("/")
    Call<ApiSearchResult> searchMovieByName(@Query("s") String name,
                                            @Query("apikey") String apiKey);

    @GET("/")
    Call<Movie> getMovieById(@Query("i") String id,
                             @Query("apikey") String apiKey,
                             @Query("plot") String plotType);

}
