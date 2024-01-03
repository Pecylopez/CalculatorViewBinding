package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
lateinit var binding : ActivityMainBinding


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        binding.btnA.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var a = binding.etA.text.toString().toDouble()
        var b = binding.etA.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_A->{
                result = a+b
            }

        }
        binding.resultTv.text= "$result"

    }
}