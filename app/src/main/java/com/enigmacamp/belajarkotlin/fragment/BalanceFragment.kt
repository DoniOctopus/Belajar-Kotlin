package com.enigmacamp.belajarkotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.enigmacamp.belajarkotlin.R
import com.enigmacamp.belajarkotlin.viewmodel.PocektViewModel
import kotlinx.android.synthetic.main.fragment_balance.*

class BalanceFragment() : Fragment() {

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
        return inflater.inflate(R.layout.fragment_balance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var balanceObserver : Observer<Int> = Observer {
            it -> textViewBalance.text = it.toString()
        }
        pocektViewModel.balance.observe(viewLifecycleOwner,balanceObserver)
    }
}