package com.karve.gomysuru1.ui.faq

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.barteksc.pdfviewer.PDFView
import com.karve.gomysuru1.R


class FaqFragment : Fragment() {
    lateinit var faqList : PDFView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_faq, container, false)
        faqList = root.findViewById(R.id.pdf_faq)

        faqList.fromAsset("faq.pdf").load()


        return root


    }



}