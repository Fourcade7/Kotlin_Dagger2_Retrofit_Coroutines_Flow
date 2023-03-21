package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.viewmodel

import androidx.lifecycle.ViewModel
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.models.response.Post
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.repository.PostRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel constructor(
    val repository: PostRepository= PostRepository()
):ViewModel() {


    suspend fun getAllData():Flow<ArrayList<Post>> = flow<ArrayList<Post>> {
        emit(repository.getAllPosts())
    }
}