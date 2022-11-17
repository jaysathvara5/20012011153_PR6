package com.example.pr6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView

class YoutubeActivity : AppCompatActivity() {
    private val youtubeId="r670DosWXtU"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val mywebview=findViewById<Any>(R.id.webview)
        val settings=mywebview.settings
        settings.javaScriptEnabled=true
        settings.loadWithOverviewMode=true
        settings.useWideViewPort=true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}

