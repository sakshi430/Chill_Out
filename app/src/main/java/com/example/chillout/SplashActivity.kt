package com.example.chillout

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity  : AppCompatActivity(){
    private val SPLASH_TIME_OUT = 3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val mHandler = Handler(Looper.getMainLooper())
        mHandler.postDelayed(
                {
                    val i = Intent(this, GenreActivity::class.java)
                    startActivity(i)
                    finish()
                }, SPLASH_TIME_OUT)
    }
}