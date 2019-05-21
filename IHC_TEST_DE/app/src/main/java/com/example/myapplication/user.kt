package com.example.myapplication

import java.util.*

class user (s : String) {

    private var alerg : ArrayList<String> ;

    init {

        val lst = s.split(" ")
        this.alerg = ArrayList<String>()
        for (item in lst){
            if (item.isBlank() || item.isEmpty()){}
            else (this.alerg.add(item.trim()))
        }
    }
    public fun getAlerg() : ArrayList<String>{return alerg}
    }
