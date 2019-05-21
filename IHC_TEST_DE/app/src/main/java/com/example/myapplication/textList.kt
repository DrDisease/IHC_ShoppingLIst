package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.io.File

class textList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_list)
        this.findViewById<Button>(R.id.saveLst).setOnClickListener {
            saveData()
            val intent = Intent(this,mainMenu::class.java).apply{}
            startActivity(intent)
        }
    }

    fun saveData(){

            //getting filename

            var filename= this.findViewById<EditText>(R.id.fname).text[0] + ".lst"


            //gettingContent
            var content = this.findViewById<EditText>(R.id.list).text

            //Getting File
            val file = File(applicationContext.filesDir,filename)

            //If file exists
            if (file.exists()){
                //Write Content
                file.printWriter().use { out ->
                    for(s in content){
                        out.println(s)
                    }
                }
            }
            //Else:
            else {
                var listIndex= File(applicationContext.filesDir,"lIndex.ind")
                if (!(listIndex.exists())){
                    listIndex.createNewFile()
                    listIndex.printWriter().use{out -> out.println(filename)}
                }
                //Create File
                file.createNewFile()
                //Writing Contents to said file
                file.printWriter().use { out ->
                    for(s in content){
                        out.println(s)
                    }
                }
            }


        }
    }
