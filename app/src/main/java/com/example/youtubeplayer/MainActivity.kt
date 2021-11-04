package com.example.youtubeplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlaySingle = findViewById<Button>(R.id.btnPlaySingle)
        val btnStandAlone = findViewById<Button>(R.id.btnStandalone)

        btnPlaySingle.setOnClickListener(this)
        btnStandAlone.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = when (v.id) {
            R.id.btnPlaySingle -> Intent(this, YoutubeActivity::class.java)
            R.id.btnStandalone -> Intent(this, StandaloneActivity::class.java)
            else -> throw IllegalArgumentException("Undefined Button Clicked")
        }
        startActivity(intent)
    }


}