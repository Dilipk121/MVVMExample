package com.mine.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.mine.mvvmexample.databinding.ActivityMainBinding
import com.mine.mvvmexample.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel // here decelaration of viewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //here we inelizte the viewmodel class here
        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)


        binding.calculate.setOnClickListener{

            val num1 = binding.numeOne.text.toString().toIntOrNull() ?: 0 // ?: is elvis operator
            val num2 = binding.numTwo.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.calculateSum(num1,num2)

            binding.result.text = "${result.sum}" // string interpolation

            binding.numeOne.text.clear()//clear edit text field
            binding.numTwo.text.clear()
        }

    }
}