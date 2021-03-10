package com.enigmacamp.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.belajarkotlin.`interface`.TransactionHandler
import com.enigmacamp.belajarkotlin.fragment.BalanceFragment
import com.enigmacamp.belajarkotlin.fragment.TransactionFragment
import kotlinx.android.synthetic.main.activity_split_screen.*

class SplitScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_screen)
    }

}