package com.example.databindingexample.example1

class Example1Interactor(private val presenter: Example1Presenter) {

    fun doHeavyStuff() {
        //does heavy stuff
        presenter.presentData("Data <3")
    }
}