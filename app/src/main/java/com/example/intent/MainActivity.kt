package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singin.setOnClickListener {
            var email = emailtext.text.toString()
            var intent = Intent(this,Shopping_activity::class.java)
            intent.putExtra("email",email)
            startActivity(intent)
        }
        createnew.setOnClickListener {
            var intent2 = Intent(this, Register_Activity::class.java)
            startActivity(intent2)
        }

    }
}