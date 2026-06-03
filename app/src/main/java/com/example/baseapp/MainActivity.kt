package com.example.baseapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 1. Create a text element programmatically
        val textView = TextView(this).apply {
            text = "Hello World! The CI built me successfully!"
            textSize = 24f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        
        // 2. Set the text element as the active content view for the screen
        setContentView(textView)
    }
}
