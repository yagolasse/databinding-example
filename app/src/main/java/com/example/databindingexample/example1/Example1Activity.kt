package com.example.databindingexample.example1

import android.app.TimePickerDialog
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityExample1Binding
import java.util.*

class Example1Activity : AppCompatActivity() {

    private val presenter = Example1Presenter()
    private val interactor = Example1Interactor(presenter)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil
            .setContentView<ActivityExample1Binding>(
                this,
                R.layout.activity_example_1
            ).also {
                it.presenter = presenter
                it.interactor = interactor
            }
    }
}