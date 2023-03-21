package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.repository

import androidx.lifecycle.LiveData
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.models.response.Post
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.network.Api
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.di.Injector
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PostRepository {
    @Inject
    lateinit var api: Api
    init {
        Injector.getRetrofitComponent("https://jsonplaceholder.typicode.com/").inject(this)
    }


    suspend fun getAllPosts():ArrayList<Post>{
        val response=api.getAllPosts()
        return response

    }


}