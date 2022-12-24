package com.utsman.binarku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*println("ini adalah main activity")
        println("ini adalah line baru di edit di github editor")

        println("ini perubahan dari feature A")

        println("ini perubahan dari feature B")

        println("ini perubahan dari feature C")

        println("ini perubahan dari develop")*/

        val angel = Human("angel", 14)
        val anton = Human(
            name = "anton",
            age = 24,
            job = "software engineer"
        )
        val febri = Human(
            name = "Febri",
            address = "Jakarta"
        )

        println("============")
        println(angel)
        println(angel.description())
        println("angel is mature: ${angel.isMature}")

        println(anton)
        println(anton.description())
        println("anton is mature: ${anton.isMature}")
        println("============")
    }
}
