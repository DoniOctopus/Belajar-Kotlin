package com.enigmacamp.belajarkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_move1.setOnClickListener(this)
        btn_move2.setOnClickListener(this)
        btn_move3.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v){
            btn_move1 -> {
                val intent = Intent(this, BuyProduct::class.java)
                startActivity(intent)
            }
            btn_move2 ->{

            }
            btn_move3 ->{

            }
        }
    }
}