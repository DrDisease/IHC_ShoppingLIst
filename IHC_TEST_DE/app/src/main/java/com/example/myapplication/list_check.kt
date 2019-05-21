package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckedTextView
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_list_check.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.io.File

class list_check : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_check)
        var lname= intent.getStringExtra("listName")
        var f = File(applicationContext.filesDir,lname+".lst")
        var str = f.readLines()
        var men = this.findViewById<LinearLayout>(R.id.linList)
        for (s in str){
            var lmnt = CheckedTextView(this)
            lmnt.setText(s)
            lmnt.setBackgroundColor(0xf2f2f2)
            lmnt.setCheckMarkDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.checked,null))
            linList.addView(lmnt)
        }
    }
}
