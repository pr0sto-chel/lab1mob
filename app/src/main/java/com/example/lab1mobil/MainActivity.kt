package com.example.lab1mobil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputEditor = findViewById(R.id.editTextTextPersonName) as EditText
        val textView = findViewById(R.id.textView) as TextView
        val Button = findViewById<Button>(R.id.button2)

        Button.setOnClickListener { }
        val numsEx = fornumbers()
        textView.setText(numsEx.numbers.joinToString())
        Button.setOnClickListener {
            textView.setText(numsEx.numbers.joinToString())
            val text = inputEditor.text.toString().toInt()
            val number = text.toInt()
            val result = numsEx.lessfind(number).toString()
            val str = numsEx.numbers.joinToString() + "\n" + "\n" + "The amount of numbers smaller than the " + text + ": " + result
            textView.setText(str)
        }
    }
    }




