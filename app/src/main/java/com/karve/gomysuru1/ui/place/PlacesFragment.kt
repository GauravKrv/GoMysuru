package com.karve.gomysuru1.ui.place

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.karve.gomysuru1.R

class PlacesFragment : Fragment() {

    lateinit var buClick1 : Button
    lateinit var buClick2 : Button
    lateinit var buClick3 : Button
    lateinit var buClick4 : Button
    lateinit var buClick5 :Button
    lateinit var buClick6 :Button
    lateinit var buClick7 :Button
    lateinit var buClick8 :Button
    lateinit var buClick9 :Button


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_places, container, false)
        buClick1 = root.findViewById(R.id.bu_loc1)
        buClick2 = root.findViewById(R.id.bu_loc2)
        buClick3 = root.findViewById(R.id.bu_loc3)
        buClick4 = root.findViewById(R.id.bu_loc4)
        buClick5 = root.findViewById(R.id.bu_loc5)
        buClick6 = root.findViewById(R.id.bu_loc6)
        buClick7 = root.findViewById(R.id.bu_loc7)
        buClick8 = root.findViewById(R.id.bu_loc8)
        buClick9 = root.findViewById(R.id.bu_loc9)

        buClick1.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Mysore+Palace/@12.305163,76.6529862,17z/data=!3m1!4b1!4m5!3m4!1s0x3baf701103f9a1f9:0xc37fbae2a124da0d!8m2!3d12.305163!4d76.6551749")
        }
        buClick2.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Kishkindha+Moolika+Bonsai+Garden/@12.2835893,76.655093,16.2z/data=!4m5!3m4!1s0x3baf6fe4232c14bf:0xb60ece94f134f4ae!8m2!3d12.2845261!4d76.6580007")
        }
        buClick3.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Sri+Chamarajendra+Zoological+Gardens/@12.2835893,76.655093,16.2z/data=!4m5!3m4!1s0x3baf7023040e7795:0xea57334ccb6cbfcb!8m2!3d12.3022057!4d76.6641882")
        }
        buClick4.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Brindavan+Gardens/@12.4217156,76.5727862,15z/data=!4m5!3m4!1s0x0:0x915fba7ee0e6b6b2!8m2!3d12.4217156!4d76.5727862")
        }
        buClick5.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/St.+Philomena's+Cathedral/@12.3210417,76.6582635,15z/data=!4m5!3m4!1s0x0:0x8e900b9cb740e32d!8m2!3d12.3210417!4d76.6582635")
        }
        buClick6.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Jaganmohan+Palace+Art+Gallery+And+Auditorium/@12.3068751,76.6498627,15z/data=!4m5!3m4!1s0x0:0xf53a44a722005fcc!8m2!3d12.3068751!4d76.6498627")
        }
        buClick7.setOnClickListener {
            goToUrl("https://www.google.com/maps/place/Folklore+Museum/@12.3134557,76.6204308,17z/data=!3m1!4b1!4m5!3m4!1s0x3baf7a9677dbb635:0x98b902115c42c711!8m2!3d12.3134557!4d76.6226195")
        }
        buClick8.setOnClickListener {
            goToUrl("https://www.google.com/maps/search/varahaswamy+temple+mysore/@12.4074796,76.4817833,11.58z")
        }
        buClick9.setOnClickListener {
            goToUrl("https://www.google.com/maps/search/important+tourist+destinations+in+mysore/@12.2980701,76.6346781,14z/data=!3m1!4b1?hl=en")
        }

        return root
    }

    private fun goToUrl(s: String) {
        var uri = Uri.parse(s)
        var intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }
}