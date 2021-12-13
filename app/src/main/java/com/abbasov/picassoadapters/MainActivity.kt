package com.abbasov.picassoadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var userAdapter: userAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrapicasso=ArrayList<Item>()
        for (i in 0..100) {
            arrapicasso.add(
                Item(
                    "https://i.pinimg.com/564x/15/94/cd/1594cd52325303bd2be3debed2e8ff4d.jpg",
                    "bmw"
                )
            )
            arrapicasso.add(
                Item(
                    "https://i.pinimg.com/564x/3f/b4/89/3fb4898da9f9f7a244d9a57472b7ed12.jpg",
                    "Valya"
                )
            )
            arrapicasso.add(
                Item(
                    "https://i.pinimg.com/564x/f8/30/02/f8300289484621600104c6e61b0f0f5c.jpg",
                    "Smoking"
                )
            )
            arrapicasso.add(
                Item(
                    "https://i.pinimg.com/564x/aa/27/26/aa2726618e5351f6505cc54b068fae6b.jpg",
                    "Karnaval"
                )
            )
        }
        userAdapter= userAdapter(this,arrapicasso)
        rv.adapter=userAdapter
    }
}