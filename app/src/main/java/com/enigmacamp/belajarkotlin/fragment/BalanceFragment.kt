package com.enigmacamp.belajarkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enigmacamp.belajarkotlin.R
import kotlinx.android.synthetic.main.fragment_balance.*

class BalanceFragment(var balance: Int = 0) : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_balance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewBalance.text = balance.toString()
    }

    fun updateBalance(balance : Int){
        this.balance = balance
        textViewBalance?.text = this.balance.toString()
    }
}