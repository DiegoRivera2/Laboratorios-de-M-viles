package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val keyName = "NAME";
    private val keyEmail = "EMAIL";
    private val keyPhone = "PHONE";

    private lateinit var editTextName: TextInputEditText
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextPhone: TextInputEditText
    private lateinit var btnSend: Button



    private fun bind(){
        editTextName = findViewById(R.id.name_editText);
        editTextEmail = findViewById(R.id.email_editText);
        editTextPhone = findViewById(R.id.number_editText);
        btnSend = findViewById(R.id.save_btn);
    }

    //TODO: change keypad to be numbers only
    private fun listeners(){
        btnSend.setOnClickListener(){
            val intent = Intent(this, SecondActivity::class.java);
            intent.putExtra(keyName, editTextName.text.toString());
            intent.putExtra(keyEmail, editTextEmail.text.toString());
            intent.putExtra(keyPhone, editTextPhone.text.toString());

            startActivity(intent);
        }
    }
}