package com.semsols.sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val sharedPreference = getSharedPreferences("DATA", Context.MODE_PRIVATE)

        LoginBtn.setOnClickListener {

            val email: String = EmailAdd.text.toString()
            val pass: String = Pass.text.toString()

            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("Email", email)
            editor.putString("Pass", pass)
            editor.apply()

            Toast.makeText(this,"Information Saved!",Toast.LENGTH_SHORT).show()

            //Go to Next Activity
            startActivity(Intent(this,MainActivity2::class.java))
            finish()






        }

    }
}