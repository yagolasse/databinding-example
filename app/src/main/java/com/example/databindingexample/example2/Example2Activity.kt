package com.example.databindingexample.example2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityExample2Binding

class Example2Activity : AppCompatActivity() {

    private val viewModel = Example2ViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityExample2Binding>(this, R.layout.activity_example_2).also {
            it.viewModel = viewModel
        }
    }
}