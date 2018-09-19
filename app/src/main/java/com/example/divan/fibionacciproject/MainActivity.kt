package com.example.divan.fibionacciproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    var terms = Pair(0, 1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener { textView.text = fibo()}


    }

     fun  fibo() :String {
var t = (terms.first + terms.second ).toString()+ "="+ terms.first.toString()+"+"+terms.second.toString()
        terms = Pair(terms.second, terms.first + terms.second)
        return  t
    }



}
