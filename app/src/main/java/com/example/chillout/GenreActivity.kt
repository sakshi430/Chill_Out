package com.example.chillout

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GenreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_layout)

    }

    fun open_scifi(view: View) {
        val intent = Intent(applicationContext,scifiActivity::class.java)
        startActivity(intent)
    }

    fun open_fantasy(view: View) {
        val intent = Intent(applicationContext,fantasyActivity::class.java)
        startActivity(intent)
    }

    fun open_horror(view: View) {
        val intent = Intent(applicationContext,horrorActivity::class.java)
        startActivity(intent)
    }

    fun open_drama(view: View) {
        val intent = Intent(applicationContext,dramaActivity::class.java)
        startActivity(intent)
    }

    fun open_comedy(view: View) {
        val intent = Intent(applicationContext,comedyActivity::class.java)
        startActivity(intent)
    }

    fun open_adventure(view: View) {
        val intent = Intent(applicationContext,adventureActivity::class.java)
        startActivity(intent)
    }

}