package com.enigmacamp.belajarkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.enigmacamp.belajarkotlin.fragment.BalanceFragment
import com.enigmacamp.belajarkotlin.fragment.TransactionFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var balanceFragment: BalanceFragment
    lateinit var transactionFragment: TransactionFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_balance.setOnClickListener(this)
        btn_transaction.setOnClickListener(this)
        btn_history.setOnClickListener(this)
        balanceFragment = BalanceFragment()
        transactionFragment = TransactionFragment()
    }

    override fun onClick(v: View?) {
        when(v){
            btn_balance -> {
                fragment(balanceFragment)
            }
            btn_transaction ->{
                fragment(transactionFragment)
            }
            btn_history ->{

            }
        }
    }

    private fun fragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fragmentContainer, fragment).commit()
    }
}