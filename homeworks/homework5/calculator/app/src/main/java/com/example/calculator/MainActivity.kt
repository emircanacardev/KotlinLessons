package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var currentInput = ""
    private var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        val keypadGrid = findViewById<GridLayout>(R.id.keypadGrid)

        for (i in 0 until keypadGrid.childCount) {
            val button = keypadGrid.getChildAt(i) as Button
            button.setOnClickListener { handleButtonClick(button.text.toString()) }
        }
    }

    private fun handleButtonClick(text: String) {
        when (text) {
            in "0".."9" -> {
                currentInput += text
                resultTextView.text = currentInput
            }
            "+" -> {
                total += currentInput.toIntOrNull() ?: 0
                resultTextView.text = total.toString()
                currentInput = ""
            }
            "C" -> {
                total = 0
                currentInput = ""
                resultTextView.text = "0"
            }
        }
    }
}
