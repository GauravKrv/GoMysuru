package com.karve.gomysuru1.ui.description

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.karve.gomysuru1.R

class RecreationDescription : AppCompatActivity() {
    lateinit var rec1 : Button
    lateinit var rec2 : Button
    lateinit var rec3 : Button
    lateinit var rec4 : Button
    lateinit var rec5 : Button
    lateinit var rec6 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recreation_description)
        rec1 = findViewById(R.id.bu_rec1)
        rec2 = findViewById(R.id.bu_rec2)
        rec3 = findViewById(R.id.bu_rec3)
        rec4 = findViewById(R.id.bu_rec4)
        rec5 = findViewById(R.id.bu_rec5)
        rec6 = findViewById(R.id.bu_rec6)


        rec1.setOnClickListener {
            goToUrl("http://mysorehathayoga.com/mhy/")
        }
        rec2.setOnClickListener {
            goToUrl("https://www.thrillophilia.com/collections/best-trekking-experiences-near-mysore")
        }
        rec3.setOnClickListener {
            goToUrl("https://www.tripadvisor.in/Attraction_Review-g304553-d15191564-Reviews-Funway-Mysuru_Mysore_Mysore_District_Karnataka.html")
        }
        rec4.setOnClickListener {
            goToUrl("https://www.feverpitchholidays.com/skydiving-in-mysore/")
        }
        rec5.setOnClickListener {
            goToUrl("https://www.tripadvisor.in/ShowUserReviews-g304553-d4702455-r545738359-Karanji_Lake-Mysuru_Mysore_Mysore_District_Karnataka.html")
        }
        rec6.setOnClickListener {
            goToUrl("https://traveltriangle.com/blog/adventure-sports-in-mysore/")
        }
    }

    fun goToUrl(s:String){
        var uri = Uri.parse(s)
        val intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}