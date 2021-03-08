package com.enigmacamp.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var nameTextView : TextView(Java Style)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        nameTextView = findViewById(R.id.nameTextView)(Java Style)
//        nameTextView.text = "Doni Octavian"(Java Style)
        //Kotlin Style
        nameTextView.text = "Doni Octavian"

    }
}