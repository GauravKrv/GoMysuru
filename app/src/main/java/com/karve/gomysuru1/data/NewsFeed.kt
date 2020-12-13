package com.karve.gomysuru1.data

import com.karve.gomysuru1.R
import com.karve.gomysuru1.module.Topics

class NewsFeed {

    fun loadHeadlines():List<Topics>{
        return listOf<Topics>(
            Topics(R.string.topic3,R.drawable.tour_guide),
            Topics(R.string.topic1,R.drawable.destination),
            Topics(R.string.topic5,R.drawable.festivals_annualevents),
              Topics(R.string.topic4,R.drawable.art_and_culture),
            Topics(R.string.topic6,R.drawable.cuisines),
            Topics(R.string.topic7,R.drawable.skydiving),
        )


    }
}