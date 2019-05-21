package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import java.io.File
import android.widget.Toast

class Allergies : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergies)
        setSaved()
        this.findViewById<Button>(R.id.saveBtn).setOnClickListener{
            saveData()
        }
    }



    //Set Saved Options to Checkbox

    fun setSaved(){

        val file = File(applicationContext.filesDir,"allergies.als")

        if (file.exists()) {

            val alrg = file.readLines()[0]

            //Checks Saved Data and Checks the CheckBox if data was found
            if (alrg.contains("egg")) {
                this.findViewById<CheckBox>(R.id.checkEggs).setChecked(true)
            }
            if (alrg.contains("fish")) {
                this.findViewById<CheckBox>(R.id.checkFish).setChecked(true)
            }
            if (alrg.contains("lact")) {
                this.findViewById<CheckBox>(R.id.checkLactose).setChecked(true)
            }
            if (alrg.contains("pean")) {
                this.findViewById<CheckBox>(R.id.checkPeanuts).setChecked(true)
            }
            if (alrg.contains("shell")) {
                this.findViewById<CheckBox>(R.id.checkShellfish).setChecked(true)
            }
            if (alrg.contains("soy")) {
                this.findViewById<CheckBox>(R.id.checkSoy).setChecked(true)
            }
            if (alrg.contains("nuts")) {
                this.findViewById<CheckBox>(R.id.checkTreeNuts).setChecked(true)
            }
            if (alrg.contains("wheat")) {
                this.findViewById<CheckBox>(R.id.checkWheat).setChecked(true)
            }
        }
    }



    // Saves user data to device memory
    fun saveData(){
        var al = ""

        if (this.findViewById<CheckBox>(R.id.checkEggs).isChecked()){al += " egg"}
        if (this.findViewById<CheckBox>(R.id.checkFish).isChecked()){al += " fish"}
        if (this.findViewById<CheckBox>(R.id.checkLactose).isChecked()){al += " lact"}
        if (this.findViewById<CheckBox>(R.id.checkPeanuts).isChecked()){al += " pean"}
        if (this.findViewById<CheckBox>(R.id.checkShellfish).isChecked()){al += " shell"}
        if (this.findViewById<CheckBox>(R.id.checkSoy).isChecked()){al += " soy"}
        if (this.findViewById<CheckBox>(R.id.checkTreeNuts).isChecked()){al += " nuts"}
        if (this.findViewById<CheckBox>(R.id.checkWheat).isChecked()){al += " wheat"}

        fileUsage("allergies.als",content = al)

        Toast.makeText(this,"Data Saved Successfully",Toast.LENGTH_SHORT).show()

    }

    fun fileUsage(filename:String,content:String=""){

        //Getting File
        val file = File(applicationContext.filesDir,filename)

        //If file exists
        if (file.exists()){
            //Write Content
            file.writeText(content)
        }
        //Else:
        else {
            //Create File
            file.createNewFile()
            //Writing Contents to said file
            file.writeText(content)
        }


    }
}
