package com.example.baseapp

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.widget.LinearLayout
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup.LayoutParams

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 1. Create a root layout container (Crucial for HyperOS)
        val rootLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            // No custom background color, leaving it as a simple blank screen
            layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        }
        
        // 2. Create the text element
        val textView = TextView(this).apply {
            text = "init apk"
            textSize = 28f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        
        // 3. Add the text to the root container
        rootLayout.addView(textView)
        
        // 4. Set the container as the active screen content
        setContentView(rootLayout)
    }
}
