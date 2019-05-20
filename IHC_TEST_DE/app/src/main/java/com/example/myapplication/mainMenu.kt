package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.main_menu.*

class mainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setContentView(R.layout.activity_main_menu)
        super.onCreate(savedInstanceState)
        this.findViewById<Button>(R.id.button3).setOnClickListener {
            goToListCreation()
        }
        this.findViewById<Button>(R.id.button4).setOnClickListener {
            goToBrowse()
        }
        this.findViewById<Button>(R.id.button5).setOnClickListener {
            goToLists()
        }
        this.findViewById<Button>(R.id.button6).setOnClickListener {
            goToPreferences()
        }
    }

    fun goToListCreation(){
        val intent = Intent(this,CreateList::class.java).apply{}
        startActivity(intent)
    }

    fun goToLists(){
        val intent = Intent(this,showLists::class.java).apply{}
        startActivity(intent)
    }

    fun goToPreferences(){
        val intent = Intent(this,Preferences::class.java).apply{}
        startActivity(intent)
    }

    fun goToBrowse(){
        val intent = Intent(this,BrowseProducts::class.java).apply{}
        startActivity(intent)
    }
}
