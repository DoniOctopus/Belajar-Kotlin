package com.enigmacamp.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.enigmacamp.belajarkotlin.fragment.BalanceFragment
import com.enigmacamp.belajarkotlin.fragment.TransactionFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_balance.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var balanceFragment: BalanceFragment
    lateinit var transactionFragment: TransactionFragment

    var balance = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_balance.setOnClickListener(this)
        btn_transaction.setOnClickListener(this)
        btn_history.setOnClickListener(this)
        balanceFragment = BalanceFragment()
        transactionFragment = TransactionFragment()
    }

    fun handelBuy(stock : Int){
        balance = balance + stock
        balanceFragment.updateBalance(balance)
    }
    fun handelSell(stock : Int){
        balance = balance - stock
        balanceFragment.updateBalance(balance)
    }

    override fun onClick(v: View?) {
        when(v){
            btn_balance -> {
                fragment(balanceFragment)
            }
            btn_transaction ->{
                fragment(transactionFragment)
            }
            btn_balance ->{

            }
        }
    }

    private fun fragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fragmentContainer, fragment).commit()
    }
}