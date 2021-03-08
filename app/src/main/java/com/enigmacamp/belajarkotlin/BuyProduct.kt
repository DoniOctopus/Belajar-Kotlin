package com.enigmacamp.belajarkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BuyProduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_product)
    }

    fun handleBack(view: View) {
    onBackPressed()
    }
}