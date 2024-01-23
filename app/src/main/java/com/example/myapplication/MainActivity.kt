package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var minimumInput: EditText
    private lateinit var maxInput: EditText
    private lateinit var resultLabel: TextView
    private lateinit var button: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        minimumInput = findViewById(R.id.min_edit)
        maxInput = findViewById(R.id.max_edit)
        resultLabel = findViewById(R.id.textResult)
        button = findViewById(R.id.result_btn)

        button.setOnClickListener {
            val minResult = Integer.parseInt(minimumInput.text.toString());
            val maxResult = Integer.parseInt(maxInput.text.toString());
            val result =(minResult..maxResult).random()

            resultLabel.text = result.toString()
        }


    }


}

