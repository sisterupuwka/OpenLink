package com.example.openlink

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val link= Uri.parse("https://google.ru")
        val intent= Intent(Intent.ACTION_VIEW, link)
        if(intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}


