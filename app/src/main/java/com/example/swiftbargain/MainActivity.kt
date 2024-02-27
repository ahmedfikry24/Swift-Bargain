package com.example.swiftbargain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Base_Theme_SwiftBargain)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}