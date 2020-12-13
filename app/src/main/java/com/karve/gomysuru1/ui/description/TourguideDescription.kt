package com.karve.gomysuru1.ui.description

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import com.karve.gomysuru1.R
import com.karve.gomysuru1.ui.contacts.ContactList

class TourguideDescription : AppCompatActivity() {
    lateinit var tg11 : ImageView
    lateinit var tg12 : ImageView
    lateinit var tg2 : LinearLayout
    lateinit var tg3 : LinearLayout
    lateinit var tg4 : LinearLayout
    lateinit var tg5 : LinearLayout
    lateinit var tg6 : LinearLayout
    lateinit var tg7 : LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourguide_description)

        tg11 = findViewById(R.id.im_tg_operator1)
        tg12 = findViewById(R.id.im_tg_operator2)
        tg2 = findViewById(R.id.ll_tg2)
        tg3 = findViewById(R.id.ll_tg3)
        tg4 = findViewById(R.id.ll_tg4)
        tg5 = findViewById(R.id.ll_tg5)
        tg6 = findViewById(R.id.ll_tg6)
        tg7 = findViewById(R.id.ll_tg7)

        tg12.setOnClickListener {
            goToUrl("https://holidayz.makemytrip.com/holidays/india/search?fromSearchWidget=true&searchDep=Mysore&dest=Mysore&depCity=New%20Delhi&dataType=All+Dates&dateSearched=All+Dates&initd=searchwidget_landing_Mysore_notheme##page_header")
        }

        tg11.setOnClickListener {
            goToUrl("https://www.goibibo.com/routeplanner/delhi-mysore/")
        }
        tg2.setOnClickListener {
            goToUrl("https://www.yatra.com/india-tour-packages/holidays-in-mysore")
        }
        tg3.setOnClickListener {
            goToUrl("https://www.olacabs.com/")
        }
        tg4.setOnClickListener {
            goToUrl("https://www.irctc.co.in/nget/train-search")
        }
        tg5.setOnClickListener {
            goToUrl("https://www.travolook.in/?gclid=Cj0KCQiA8dH-BRD_ARIsAC24umYi4_2SOr7MU0g9Wc8PiecVcBb_1ReiONi8y9yjELlzvvxlw8JCcTQaAjFpEALw_wcB")
        }
        tg6.setOnClickListener {
            goToUrl("https://www.google.com/maps/search/+consulates++and+embassies+in+mysore/@14.2362699,75.7478013,6.68z")
        }
        tg7.setOnClickListener {
            val intent = Intent(applicationContext, PhraseList::class.java)
            startActivity(intent)
        }


    }

    private fun goToUrl(s: String) {
        var uri = Uri.parse(s)
        var intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}