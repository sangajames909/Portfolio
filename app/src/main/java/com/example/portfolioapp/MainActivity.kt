package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var text_view: TextView
    lateinit var textview: TextView
    lateinit var texting: TextView
    lateinit var text: TextView
    lateinit var recy: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //home
        text_view = findViewById(R.id.textView)
        text_view.setOnClickListener {
            Toast.makeText(applicationContext,"Already In home page",Toast.LENGTH_LONG).show()
        }
        //contact
        textview = findViewById(R.id.textView2)
        textview.setOnClickListener {
            val intentContact = Intent(this@MainActivity,Contact::class.java)
            startActivity(intentContact)
        }
        //bio
        texting = findViewById(R.id.textView3)
        texting.setOnClickListener {
            val intentbiopage = Intent(this@MainActivity,Bio::class.java)
            startActivity(intentbiopage)
        }
        //about
        text = findViewById(R.id.textView4)
        text.setOnClickListener {
            val intentAboutme = Intent(this@MainActivity,About::class.java)
            startActivity(intentAboutme)
        }


    }
}