package com.example.youtubeplayer

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StandaloneActivity : AppCompatActivity(), View.OnClickListener {

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_standalone)

        val btnPlayVideo = findViewById<Button>(R.id.btnPlayVideo)
        val btnPlayList = findViewById<Button>(R.id.btnPlaylist)

        btnPlayVideo.setOnClickListener(this)
        btnPlayList.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}