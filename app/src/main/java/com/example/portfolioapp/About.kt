package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class About : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private lateinit var bottom: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        bottom = findViewById(R.id.BottomNav)
        bottom.setOnNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home ->{
                val intentHome = Intent(this@About,MainActivity::class.java)
                startActivity(intentHome)
            }
            R.id.nav_contact ->{
                val intentContact = Intent(this@About,Contact::class.java)
                startActivity(intentContact)
            }
            R.id.nav_bio ->{
                val intentBio = Intent(this@About,Bio::class.java)
                startActivity(intentBio)
            }
            R.id.nav_about ->{
                val intentAbout = Intent(this@About,About::class.java)
                startActivity(intentAbout)
            }
        }
        return true
    }
}