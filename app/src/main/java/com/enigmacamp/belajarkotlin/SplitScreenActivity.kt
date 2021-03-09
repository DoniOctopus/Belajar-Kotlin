package com.enigmacamp.belajarkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.belajarkotlin.`interface`.TransactionHandler
import com.enigmacamp.belajarkotlin.fragment.BalanceFragment
import com.enigmacamp.belajarkotlin.fragment.TransactionFragment
import kotlinx.android.synthetic.main.activity_split_screen.*

class SplitScreenActivity : AppCompatActivity(), TransactionHandler {
    var balance = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split_screen)
        (fragment2 as TransactionFragment).transactionHandler = this
    }

    override fun handelBuy(stock: Int) {
        this.balance = balance + stock
        (fragment as BalanceFragment).updateBalance(this.balance)
    }

    override fun handelSell(stock: Int) {
        this.balance = balance - stock
        (fragment as BalanceFragment).updateBalance(this.balance)
    }
}