package com.example.baseapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup.LayoutParams

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this).apply {
            text = "Hello World! I am alive!"
            textSize = 28f
            setTextColor(Color.WHITE)
            // A bright blue background makes it impossible to mistake for a blank screen
            setBackgroundColor(Color.BLUE) 
            gravity = Gravity.CENTER
            // Force the view to fill the entire screen
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        }
        
        setContentView(textView)
    }
}
