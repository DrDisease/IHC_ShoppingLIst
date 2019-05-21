package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list)
        this.findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent(this,textList::class.java).apply{}
            startActivity(intent)
        }
    }
}
