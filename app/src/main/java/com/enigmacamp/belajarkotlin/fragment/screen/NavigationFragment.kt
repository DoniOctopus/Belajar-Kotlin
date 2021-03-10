package com.enigmacamp.belajarkotlin.fragment.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.enigmacamp.belajarkotlin.R
import kotlinx.android.synthetic.main.fragment_navigation.*


class NavigationFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_balance.setOnClickListener(this)
        btn_history.setOnClickListener(this)
        btn_transaction.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
//           btn_balance -> findNavController().navigate(R.id.action_navigationFragment_to_balanceFragment)
//           btn_transaction -> findNavController().navigate(R.id.action_navigationFragment_to_transactionFragment)
        }
    }
}