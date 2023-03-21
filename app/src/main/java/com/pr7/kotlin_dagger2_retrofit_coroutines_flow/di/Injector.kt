package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.di

object Injector {

    fun getRetrofitComponent(BASE_URL:String): DataComponent {
        val component:DataComponent=DaggerDataComponent.builder().dataModule(DataModule(BASE_URL)).build()
        return component
    }

}