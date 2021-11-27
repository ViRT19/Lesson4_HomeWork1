package com.example.lesson3_homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val strTextView: TextView = findViewById(R.id.str_view)
        val newTextButton: Button = findViewById(R.id.view_text_buton)
        val str: String = "abcdefghijklmnopqrstuvwxyz"
        var newStr: String = ""

        fun oddStr() {
            newStr = ""
            for (i in 1..str.length - 1 step 2)
                newStr += str[i].toString()
        }

        newTextButton.setOnClickListener {
//            hellowTextView.text = Random.nextInt(100).toString()
            oddStr()
            strTextView.text = newStr
        }
    }


}