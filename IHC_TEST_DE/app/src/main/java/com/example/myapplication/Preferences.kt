package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Preferences : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
        this.findViewById<Button>(R.id.button7).setOnClickListener {
            goToAlergies()
        }
    }

    fun goToAlergies(){
        val intent = Intent(this,Allergies::class.java).apply{}
        startActivity(intent)
    }


}
