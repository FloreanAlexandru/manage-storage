package com.example.trutziwms;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
        @GET("laravel/api/nomenclatortotal")
        Call<List<Item>> I40052 ();
}