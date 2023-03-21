package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.network

import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.models.response.Post
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("posts")
    suspend fun getAllPosts(): ArrayList<Post>
}