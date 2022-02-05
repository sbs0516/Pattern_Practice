package com.example.pattern_practice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Presenter.View {

    lateinit var presenter: Presenter
    lateinit var title: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById<TextView>(R.id.title)
        presenter = PresenterImpl(this@MainActivity)

        title.setOnClickListener {
            presenter.confirm()
        }

    }
    override fun setText(text: String) {
        title.text = text
    }
}

class Model {
    fun clickTextView(): String {
        return "첫째줄 문장. MVP"
    }
}