package com.karve.gomysuru1.ui.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.github.barteksc.pdfviewer.PDFView
import com.karve.gomysuru1.R

class ContactList : AppCompatActivity() {
  lateinit var contactList : PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

       contactList = findViewById(R.id.pdf_contact_list)

        contactList.fromAsset("important_contacts.pdf").load()
    }
}