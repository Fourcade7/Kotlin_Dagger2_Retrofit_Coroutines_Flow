package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.di

import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.repository.PostRepository
import dagger.Component

@Component(modules = [DataModule::class])
interface DataComponent {
    fun inject(postRepository: PostRepository)
}