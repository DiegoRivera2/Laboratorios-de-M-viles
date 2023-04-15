package com.example.lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar!!.hide()


        var editTextName = findViewById <TextView>(R.id.name_textview);
        var editTextEmail = findViewById <TextView>(R.id.email_textview);
        var editTextPhone = findViewById <TextView>(R.id.number_textview);
        var btnShare = findViewById<Button>(R.id.share_btn)


        val name = intent.getStringExtra(keyName).toString() ?: ""
        val email = intent.getStringExtra(keyEmail).toString() ?: ""
        val phone = intent.getStringExtra(keyPhone).toString() ?: ""

        editTextName.text = name;
        editTextEmail.text = email;
        editTextPhone.text = phone;

        listeners(btnShare, name, email, phone);
    }

    private val keyName = "NAME";
    private val keyEmail = "EMAIL";
    private val keyPhone = "PHONE";

    private fun listeners(btnShare: Button, name: String, email: String, phone : String){
        btnShare.setOnClickListener(){
            val publicIntent : Intent = Intent().apply {
                action = Intent.ACTION_SEND;
                putExtra(Intent.EXTRA_TEXT, getString(R.string., name, email, phone));

                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(publicIntent, "This is my personal information");
            startActivity(shareIntent);
        }
    }
}