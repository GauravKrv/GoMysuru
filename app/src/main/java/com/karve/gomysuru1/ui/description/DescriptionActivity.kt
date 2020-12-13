package com.karve.gomysuru1.ui.description

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.karve.gomysuru1.R

class DescriptionActivity : AppCompatActivity() {
    lateinit var bu_des1 : Button
    lateinit var bu_des2 : Button
    lateinit var bu_des3 : Button
    lateinit var bu_des4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)
        bu_des1 = findViewById(R.id.bu_dest1)
        bu_des2 = findViewById(R.id.bu_dest2)
        bu_des3 = findViewById(R.id.bu_des3)
        bu_des4 = findViewById(R.id.bu_des4)

        bu_des1.setOnClickListener {
            goToUrl("https://www.mysorepalace.gov.in/")
        }
        bu_des2.setOnClickListener {
            goToUrl("https://www.karnataka.com/mysore/kishkinda-moolika-bonsai-garden/")
        }
        bu_des3.setOnClickListener {
            goToUrl("http://mysorezoo.info/")
        }

        bu_des4.setOnClickListener {
            goToUrl("https://www.thrillophilia.com/mysore-tourist-places")
        }
    }

    private fun goToUrl(s: String) {
        var uri = Uri.parse(s)
        var intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}