package com.enigmacamp.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var resultView = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_increment.setOnClickListener(this)
        btn_decrement.setOnClickListener(this)
        btn_reset.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            btn_increment -> {
                resultView +=1
                result.text = resultView.toString()
            }
            btn_decrement ->{
                resultView -=1
                result.text = resultView.toString()
            }
            btn_reset ->{
                resultView = 0
                result.text = resultView.toString()
            }
        }
    }
}