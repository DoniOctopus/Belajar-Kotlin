package com.enigmacamp.belajarkotlin.viewmodel

import androidx.lifecycle.ViewModel

class PocektViewModel: ViewModel() {
    var balance = 0

    fun handleIncrement(increment : Int){
        balance += increment
    }
    fun handleDecrement(decrement : Int){
        balance -= decrement
    }
}