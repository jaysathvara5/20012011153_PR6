package com.example.pr6

import android.content.Intent
import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val myvideoview=findViewById<VideoView>(R.id.video)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()
        val button=findViewById<FloatingActionButton>(R.id.floating)
        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).apply{
                startActivity(this)
            }
        }
    }
}

private fun VideoView.setMediaController(mediaController: MediaController) {
    TODO("Not yet implemented")
}

