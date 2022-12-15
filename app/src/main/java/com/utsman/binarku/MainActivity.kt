package com.utsman.binarku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("ini adalah main activity")
        println("ini adalah line baru di edit di github editor")

        println("ini perubahan dari feature A")
    }
}
