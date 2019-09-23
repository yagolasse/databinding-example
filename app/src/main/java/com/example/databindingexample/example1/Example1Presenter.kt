package com.example.databindingexample.example1

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Example1Presenter : BaseObservable() {

    var textToShow: String = ""
        @Bindable get() = formatNewText(field)
        set(value) {
            if (value != field) {
                field = value
                notifyPropertyChanged(BR.textToShow)
            }
        }

    var shouldHideButton: Boolean = false
        @Bindable get
        set(value) {
            if (value != field) {
                field = value
                notifyPropertyChanged(BR.shouldHideButton)
            }
        }


    fun presentData(data: String) {
        textToShow = data
        shouldHideButton = true
    }

    private fun formatNewText(newText: String) = newText.replace("<3", ":heart:")
}