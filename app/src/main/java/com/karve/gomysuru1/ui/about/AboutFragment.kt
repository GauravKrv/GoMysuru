package com.karve.gomysuru1.ui.about

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.barteksc.pdfviewer.PDFView
import com.karve.gomysuru1.R


class AboutFragment : Fragment() {
    lateinit var aboutList : PDFView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_about, container, false)
        aboutList = root.findViewById(R.id.pdf_about_list)

        aboutList.fromAsset("about.pdf").load()

        return root
    }



}