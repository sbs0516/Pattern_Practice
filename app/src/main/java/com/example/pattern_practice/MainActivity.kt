package com.example.pattern_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = findViewById<TextView>(R.id.title)
        val subTitle = findViewById<TextView>(R.id.subTitle)

        title.text = "처음 문장"
        subTitle.text = "처음 확인"

        title.setOnClickListener {
            title.text = clickTextView()
        }
    }
    private fun clickTextView(): String {
        return "문장을 눌렀다"
    }
}