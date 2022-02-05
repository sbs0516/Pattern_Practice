package com.example.pattern_practice

interface Presenter {
    fun confirm()

    interface View {
        fun setText(text: String)
    }
}