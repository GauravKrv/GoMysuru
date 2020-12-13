package com.karve.gomysuru1.ui.weather

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.karve.gomysuru1.R
import java.net.URI

class WeatherFragment : Fragment() {

    lateinit var buClick1 : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_weather, container, false)

        buClick1 = root.findViewById(R.id.bu_current_weather)

        buClick1.setOnClickListener {
            goToUrl("https://weather.com/en-IN/weather/today/l/12b93fbc61001644d77455a4b541387c972c676e79e81dc6c27575c1628db498")
        }
            return root
    }

   private fun goToUrl(s:String){
       var uri = Uri.parse(s)
       val intent = Intent(Intent.ACTION_VIEW,uri)
       startActivity(intent)
   }




}