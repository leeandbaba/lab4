package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping.*

class Shopping_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)
        var textval = intent.getStringExtra("email")
        email.text = "Well come $textval"

        electronics.setOnClickListener{
            Toast.makeText(this, "You have chosen the Electronics category of shopping", Toast.LENGTH_LONG).show()
        }
        food.setOnClickListener{
            Toast.makeText(this, "You have chosen the Food category of shopping", Toast.LENGTH_LONG).show()
        }
        beauty.setOnClickListener{
            Toast.makeText(this, "You have chosen the Beauty category of shopping", Toast.LENGTH_LONG).show()
        }
        cloth.setOnClickListener{
            Toast.makeText(this, "You have chosen the cloths category of shopping", Toast.LENGTH_LONG).show()
        }

    }
}