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
        Toast.makeText(this, "You have clicked fantasy", Toast.LENGTH_SHORT).show();
    }

    fun open_horror(view: View) {
        Toast.makeText(this, "You have clicked horror", Toast.LENGTH_SHORT).show();
    }

    fun open_drama(view: View) {
        Toast.makeText(this, "You have clicked drama", Toast.LENGTH_SHORT).show();
    }

    fun open_comedy(view: View) {
        Toast.makeText(this, "You have clicked comedy", Toast.LENGTH_SHORT).show();
    }

    fun open_adventure(view: View) {
        Toast.makeText(this, "You have clicked adventure", Toast.LENGTH_SHORT).show();
    }

}