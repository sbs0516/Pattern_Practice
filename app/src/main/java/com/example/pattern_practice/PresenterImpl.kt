package com.example.pattern_practice

class PresenterImpl internal constructor(private val view: Presenter.View?) :
    Presenter {
    private val model = Model()

    override fun confirm() {
        view?.setText(model.clickTextView())
    }

}