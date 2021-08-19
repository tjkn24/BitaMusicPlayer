package com.example.bitamusicplayer

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MusicPlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_player)

        if (Build.VERSION.SDK_INT >= 23)
            checkPermission()
    }

    private fun checkPermission() {

    }
}