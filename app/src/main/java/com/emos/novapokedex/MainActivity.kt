package com.emos.novapokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)
        val button15 = findViewById<Button>(R.id.button15)
        val button16 = findViewById<Button>(R.id.button16)
        val button17 = findViewById<Button>(R.id.button17)
        val button18 = findViewById<Button>(R.id.button18)
        val button19 = findViewById<Button>(R.id.button19)
        val button20 = findViewById<Button>(R.id.button20)

        button.setOnClickListener{

            IrParaTela1()
        }
        button2.setOnClickListener{

            IrParaTela2()
        }
        button3.setOnClickListener{

            IrParaTela3()
        }
        button4.setOnClickListener{

            IrParaTela4()
        }
        button5.setOnClickListener{

            IrParaTela5()
        }
        button6.setOnClickListener{

            IrParaTela6()
        }
        button7.setOnClickListener{

            IrParaTela7()
        }
        button8.setOnClickListener{

            IrParaTela8()
        }
        button9.setOnClickListener{

            IrParaTela9()
        }
        button10.setOnClickListener{

            IrParaTela10()
        }
        button11.setOnClickListener{

            IrParaTela11()
        }
        button12.setOnClickListener{

            IrParaTela12()
        }
        button13.setOnClickListener{

            IrParaTela13()
        }
        button14.setOnClickListener{

            IrParaTela14()
        }
        button15.setOnClickListener{

            IrParaTela15()
        }
        button16.setOnClickListener{

            IrParaTela16()
        }
        button17.setOnClickListener{

            IrParaTela17()
        }
        button18.setOnClickListener{

            IrParaTela18()
        }
        button19.setOnClickListener{

            IrParaTela19()
        }
        button20.setOnClickListener{

            IrParaTela20()
        }
    }

    private fun IrParaTela1() {

        val mainActivity2 = Intent(this, MainActivitym::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela2() {

        val mainActivity2 = Intent(this, MainActivity2::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela3() {

        val mainActivity2 = Intent(this, MainActivity3::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela4() {

        val mainActivity2 = Intent(this, MainActivity4::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela5() {

        val mainActivity2 = Intent(this, MainActivity5::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela6() {

        val mainActivity2 = Intent(this, MainActivity6::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela7() {

        val mainActivity2 = Intent(this, MainActivity7::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela8() {

        val mainActivity2 = Intent(this, MainActivity8::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela9() {

        val mainActivity2 = Intent(this, MainActivity9::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela10() {

        val mainActivity2 = Intent(this, MainActivity10::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela11() {

        val mainActivity2 = Intent(this, MainActivity11::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela12() {

        val mainActivity2 = Intent(this, MainActivity12::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela13() {

        val mainActivity2 = Intent(this, MainActivity13::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela14() {

        val mainActivity2 = Intent(this, MainActivity14::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela15() {

        val mainActivity2 = Intent(this, MainActivity15::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela16() {

        val mainActivity2 = Intent(this, MainActivity16::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela17() {

        val mainActivity2 = Intent(this, MainActivity17::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela18() {

        val mainActivity2 = Intent(this, MainActivity18::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela19() {

        val mainActivity2 = Intent(this, MainActivity19::class.java)
        startActivity(mainActivity2)
    }
    private fun IrParaTela20() {

        val mainActivity2 = Intent(this, MainActivity20::class.java)
        startActivity(mainActivity2)
    }
}

