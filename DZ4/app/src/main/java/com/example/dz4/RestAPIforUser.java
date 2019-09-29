package com.example.dz4;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface RestAPIforUser {
    @GET("users/{user}")
    Call<RetrofitModel> loadUsers(@Path("user") String user);
}
