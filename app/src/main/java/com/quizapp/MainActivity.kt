package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN

        submitbutton.setOnClickListener {
            if (name_box?.text.toString().isEmpty()) {
                Toast.makeText(this,"Enter your name", Toast.LENGTH_SHORT).show()
            } else {
            val nextpage = Intent(this, QuizActivity::class.java)
            startActivity(nextpage)
            }
        }
    }
}