package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import android.widget.TextView
import java.io.File

class showLists : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_lists)

        var file = File(applicationContext.filesDir,"lIndex.ind")
        var s = file.readLines()
        var cnt = ArrayList<TextView>()
        for(str in s){
            var txt = TextView(this)
            txt.text=str.split("complete")[0]
            txt.setBackgroundColor(0xf2f2f2)
            cnt.add(txt)
            this.findViewById<ScrollView>(R.id.scrollable).addView(txt)
        }
        for(c in cnt){
            c.setOnClickListener{
                val intent = Intent(this,ListDisplay::class.java).apply{
                    intent.putExtra("listName",c.text)
                }
                startActivity(intent)
            }
        }

    }
}
