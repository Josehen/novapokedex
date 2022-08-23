package com.emos.novapokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)
        supportActionBar!!.hide()
        Handler().postDelayed({
            val intent = Intent (this@MainActivitySplash, MainActivityMenu::class.java)
            startActivity(intent)
            finish() } ,3000)
    }
}