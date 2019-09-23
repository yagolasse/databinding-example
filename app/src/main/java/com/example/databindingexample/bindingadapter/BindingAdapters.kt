package com.example.databindingexample.bindingadapter

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import androidx.databinding.BindingAdapter

@BindingAdapter("app:hideIfTrue")
fun AppCompatButton.hideIfTrue(shouldHide: Boolean) {
    this.visibility = if (shouldHide) View.GONE else View.VISIBLE
}