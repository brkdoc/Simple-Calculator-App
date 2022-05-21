package com.burakdemir.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.burakdemir.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var operand1:Int?=0
    private var operand2: Int?=0
    private var result: Double?=0.0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

    }
    fun plus(view:View){
        operand1=binding.textNum1.text.toString().toIntOrNull()
        operand2=binding.textNum2.text.toString().toIntOrNull()
        if (operand1==null||operand2==null)
        {
            binding.valueTextView.text="Error"
        }
        else{
            result=(operand1!!+operand2!!).toDouble()
            binding.valueTextView.text=result.toString()
        }

    }
    fun substract(view: View){
        operand1=binding.textNum1.text.toString().toIntOrNull()
        operand2=binding.textNum2.text.toString().toIntOrNull()
        if (operand1==null||operand2==null)
        {
            binding.valueTextView.text="Error"
        }
        else{
            result=(operand1!!-operand2!!).toDouble()
            binding.valueTextView.text=result.toString()
        }

    }
    fun divide(view:View){
        operand1=binding.textNum1.text.toString().toIntOrNull()
        operand2=binding.textNum2.text.toString().toIntOrNull()
        if (operand1==null||operand2==null||operand2==0)
        {
            binding.valueTextView.text="Error"
        }
        else{
            result=(operand1!!.toDouble()/operand2!!)
            binding.valueTextView.text=result.toString()
        }

    }
    fun multiply(view:View){
        operand1=binding.textNum1.text.toString().toIntOrNull()
        operand2=binding.textNum2.text.toString().toIntOrNull()
        if (operand1==null||operand2==null)
        {
            binding.valueTextView.text="Error"
        }
        else{
            result=(operand1!!*operand2!!).toDouble()
            binding.valueTextView.text=result.toString()
        }

    }

}
