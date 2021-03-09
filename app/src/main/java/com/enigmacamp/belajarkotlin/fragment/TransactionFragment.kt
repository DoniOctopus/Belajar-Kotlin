package com.enigmacamp.belajarkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enigmacamp.belajarkotlin.MainActivity
import com.enigmacamp.belajarkotlin.R
import kotlinx.android.synthetic.main.fragment_transcation.*

class TransactionFragment : Fragment(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transcation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_sell.setOnClickListener(this)
        btn_buy.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            btn_buy ->{
                (activity as MainActivity).handelBuy(textInputTransaction.text.toString().toInt())
            }
            btn_sell ->{
                (activity as MainActivity).handelSell(textInputTransaction.text.toString().toInt())
            }
        }
    }

}