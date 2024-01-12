package com.mine.mvvmexample.viewmodel

import androidx.lifecycle.ViewModel
import com.mine.mvvmexample.model.ModelCalculator

class CalculatorViewModel:ViewModel() {

    fun calculateSum(num1: Int, num2: Int):ModelCalculator{

        val result = num1 + num2

        return ModelCalculator(num1,num2,result)
    }

}