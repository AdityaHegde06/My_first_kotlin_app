package com.example.hellokotlin_app


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.EditText

import androidx.activity.ComponentActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun go(view: View)
    {
        // Find the EditText by its ID
        val editText: EditText = findViewById(R.id.text)

        // Get the current date and format it
        val currentDate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())

        // Set the text with "Hello Kotlin!" and the formatted date
        editText.setText("Hello Kotlin!\nDate: $currentDate")
    }
}
