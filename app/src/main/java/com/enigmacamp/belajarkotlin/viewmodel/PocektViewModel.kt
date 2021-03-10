package com.enigmacamp.belajarkotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PocektViewModel: ViewModel() {
    var balance : MutableLiveData<Int> = MutableLiveData(0)

    fun handleIncrement(increment : Int){
        balance.postValue(balance.value?.plus(increment))
    }
    fun handleDecrement(decrement : Int){
        balance.postValue(balance.value?.minus(decrement))
    }
}