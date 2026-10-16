package com.example.animecutstudio

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setBackgroundColor(Color.rgb(18, 18, 28))
        layout.setPadding(24, 24, 24, 24)

        val title = TextView(this)
        title.text = "AnimeCut Studio"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Your anime editing journey starts here."
        subtitle.textSize = 16f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 16, 0, 0)

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
