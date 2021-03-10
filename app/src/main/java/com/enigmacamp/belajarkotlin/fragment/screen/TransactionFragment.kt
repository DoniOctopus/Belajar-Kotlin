package com.enigmacamp.belajarkotlin.fragment.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.belajarkotlin.R
import com.enigmacamp.belajarkotlin.viewmodel.PocektViewModel
import kotlinx.android.synthetic.main.fragment_transcation.*

class TransactionFragment() : Fragment(), View.OnClickListener {

    lateinit var pocektViewModel : PocektViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        pocektViewModel = ViewModelProvider(requireActivity()).get(PocektViewModel::class.java)
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
                pocektViewModel.handleIncrement(textInputTransaction.text.toString().toInt())
            }
            btn_sell ->{
                pocektViewModel.handleDecrement(textInputTransaction.text.toString().toInt())
            }
        }
    }

}