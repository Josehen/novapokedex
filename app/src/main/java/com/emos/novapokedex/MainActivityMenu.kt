package com.emos.novapokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        supportActionBar!!.hide()
        val button21 = findViewById<Button>(R.id.button21)
        button21.setOnClickListener{

            IrParaTela61()
        }
    }
    private fun IrParaTela61() {

        val mainActivity2 = Intent(this, MainActivity::class.java)
        startActivity(mainActivity2)
    }
}