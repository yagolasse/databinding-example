package com.example.databindingexample.example2

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Example2ViewModel : BaseObservable() {

    var textToShow: String = ""
        @Bindable get() = field.formatEmoticon()
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


    fun callApi() {
        //calls repository or anything to do heavy work
        textToShow = "Data <3"
        shouldHideButton = true
    }
}