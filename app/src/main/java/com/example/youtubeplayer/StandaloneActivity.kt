package com.example.youtubeplayer

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.youtube.player.YouTubeStandalonePlayer
import java.lang.IllegalArgumentException

class StandaloneActivity : AppCompatActivity(), View.OnClickListener {

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_standalone)

        val btnPlayVideo = findViewById<Button>(R.id.btnPlayVideo)
        val btnPlayList = findViewById<Button>(R.id.btnPlaylist)

        btnPlayVideo.setOnClickListener(this)
        btnPlayList.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = when (v.id) {
            R.id.btnPlayVideo -> YouTubeStandalonePlayer.createVideoIntent(
                this, getString(R.string.GOOGLE_API_KEYS), YOUTUBE_VIDEO_ID, 0, true, false)
            R.id.btnPlaylist -> YouTubeStandalonePlayer.createPlaylistIntent(
                this, getString(R.string.GOOGLE_API_KEYS), YOUTUBE_PLAYLIST, 0, 0, true, true)
            else -> throw IllegalArgumentException("Undefined Button Clicked")
        }
        startActivity(intent)
    }
}