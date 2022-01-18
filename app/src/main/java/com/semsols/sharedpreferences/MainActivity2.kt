package com.semsols.sharedpreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val Preferences  = getSharedPreferences("DATA",Context.MODE_PRIVATE)

        val email = Preferences.getString("Email","")
        emailAdd2.text = email
        val passWord = Preferences.getString("Pass", "")
        pass2.text = passWord

        logoutBtn.setOnClickListener {

            val editor: SharedPreferences.Editor = Preferences.edit()
            editor.clear()
            editor.apply()

            startActivity(Intent(this,MainActivity::class.java))
            finish()

        }

    }
}