package com.pr7.kotlin_dagger2_retrofit_coroutines_flow.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.R
import com.pr7.kotlin_dagger2_retrofit_coroutines_flow.viewmodel.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
     val TAG = "PR77777"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel=ViewModelProvider(this@MainActivity).get(MainViewModel::class.java)

        GlobalScope.launch(Dispatchers.IO) {
            Log.d(TAG, "onCreate: request started")
            mainViewModel.getAllData().collect{
                Log.d(TAG, "onCreate: ${it.size}")
            }
            Log.d(TAG, "onCreate: request ended")
        }
    }
}