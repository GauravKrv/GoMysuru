package com.karve.gomysuru1.ui.hotels

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.karve.gomysuru1.R

class HotelsFragment : Fragment() {

lateinit var buClick1 :Button
    lateinit var buClick2 :Button
    lateinit var buClick3 :Button
    lateinit var buClick4 :Button
    lateinit var buClick5 :Button

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
               val root = inflater.inflate(R.layout.fragment_hotels, container, false)


            buClick1 = root.findViewById(R.id.bu_hotel1)
        buClick2 = root.findViewById(R.id.bu_hotel2)
        buClick3 = root.findViewById(R.id.bu_hotel3)
        buClick4 = root.findViewById(R.id.bu_hotel4)
        buClick5 = root.findViewById(R.id.bu_hotel9)

        buClick1.setOnClickListener {
            goToUrl("https://www.agoda.com/en-in/royal-orchid-metropole-hotel/hotel/mysore-in.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1829958&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2020-12-21&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=INR&isFreeOccSearch=false&tag=e09b0bc4-ec1a-0df3-c8bb-33e6f8e218f9&tspTypes=2,16&los=1&searchrequestid=44b5b5fc-9df8-4c2b-aca8-aa7890ad3be4&tabbed=true")
        }
        buClick2.setOnClickListener {
            goToUrl("https://www.agoda.com/en-in/the-quorum-hotel/hotel/mysore-in.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1829958&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2020-12-21&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=INR&isFreeOccSearch=false&tag=e09b0bc4-ec1a-0df3-c8bb-33e6f8e218f9&tspTypes=9,8&los=1&searchrequestid=44b5b5fc-9df8-4c2b-aca8-aa7890ad3be4&tabbed=true")
        }
        buClick3.setOnClickListener {
            goToUrl("https://www.agoda.com/en-in/lalitha-mahal-palace-hotel_6/hotel/mysore-in.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1829958&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2020-12-21&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=INR&isFreeOccSearch=false&tag=e09b0bc4-ec1a-0df3-c8bb-33e6f8e218f9&tspTypes=16,8&los=1&searchrequestid=44b5b5fc-9df8-4c2b-aca8-aa7890ad3be4&tabbed=true")
        }
        buClick4.setOnClickListener {
            goToUrl("https://www.agoda.com/en-in/hotel-le-ruchi-the-prince/hotel/mysore-in.html?finalPriceView=1&isShowMobileAppPrice=false&cid=1829958&numberOfBedrooms=&familyMode=false&adults=1&children=0&rooms=1&maxRooms=0&checkIn=2020-12-21&isCalendarCallout=false&childAges=&numberOfGuest=0&missingChildAges=false&travellerType=-1&showReviewSubmissionEntry=false&currencyCode=INR&isFreeOccSearch=false&tag=e09b0bc4-ec1a-0df3-c8bb-33e6f8e218f9&tspTypes=16&los=1&searchrequestid=44b5b5fc-9df8-4c2b-aca8-aa7890ad3be4&tabbed=true")
        }
        buClick5.setOnClickListener {
                goToUrl("https://www.trivago.in/en?themeId=1&iPathId=94410&sem_keyword=hotel%20in%20mysore&sem_creativeid=485457495262&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=11541041494&sem_adgroupid=115458724754&sem_targetid=kwd-140027076&sem_location=1007799&cip=9119000439&gclid=Cj0KCQiA8dH-BRD_ARIsAC24uma0btrlDYJZpI6jj5V0OiRpemsX5NioGl4tvjEdkNq01mDhFsX5B18aArUZEALw_wcB")
        }


        return root
    }

    private fun goToUrl(s: String) {
         var uri = Uri.parse(s)
        var intent = Intent(Intent.ACTION_VIEW,uri)
        startActivity(intent)
    }


}