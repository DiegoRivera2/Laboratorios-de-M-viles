package com.example.lab3_diegorivera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var five_cents: ImageView
    private lateinit var ten_cents: ImageView
    private lateinit var quarter:ImageView
    private lateinit var one_dollar: ImageView
    private lateinit var money_counter: TextView
    private var money = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        addListeners()

    }

    fun addListeners(){

        five_cents.setOnClickListener(){
            money += 0.05
            money_counter.text = "${money.toString()}"
        }

        ten_cents.setOnClickListener(){
            money += 0.10
            money_counter.text = "${money.toString()}"
        }

        quarter.setOnClickListener(){
            money += 0.25
            money_counter.text = "${money.toString()}"
        }

        one_dollar.setOnClickListener(){
            money += 1.00
            money_counter.text = "${money.toString()}"
        }
    }

    fun bind(){

        five_cents = findViewById(R.id.five_cents_imageView)
        ten_cents = findViewById(R.id.ten_cents_imageView)
        quarter = findViewById(R.id.quarter_imageView)
        one_dollar = findViewById(R.id. one_dollar_imageView)
        money_counter = findViewById(R.id.money_counter_textView)


    }
}