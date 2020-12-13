package com.karve.gomysuru1.ui.description

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView
import com.karve.gomysuru1.R

class PhraseList : AppCompatActivity() {
    lateinit var phraseList : PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrase_list)

        phraseList = findViewById(R.id.pdf_phrase_list)

        phraseList.fromAsset("phrases.pdf").load()
    }
}