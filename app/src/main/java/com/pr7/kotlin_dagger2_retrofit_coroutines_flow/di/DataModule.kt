package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.di

import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.data.network.Api
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class DataModule constructor(
    val BASE_URL:String
) {

    @Provides
    fun provideRetrofit():Retrofit{
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return  retrofit
    }

    @Provides
    fun provideApi(retrofit: Retrofit):Api{
        val api=retrofit.create(Api::class.java)
        return api
    }
}