package com.example.sanskarapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnSend.setOnClickListener {
            val textEntered=etTypeHere.text.toString()
            Intent(this@MainActivity,SecondActivity::class.java).also {
                it.putExtra("text",textEntered)
                startActivity(it)
            }
        }
    }
}