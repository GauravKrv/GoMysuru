package com.karve.gomysuru1.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.karve.gomysuru1.R
import com.karve.gomysuru1.module.Topics
import com.karve.gomysuru1.ui.description.*

class HomeRecyclerListAdapter(val context:Context, val itemList : List<Topics>) : RecyclerView.Adapter<HomeRecyclerListAdapter.HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_single_list_row,parent,false)
  return HomeViewHolder(view)
    }


    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        val item = itemList[position]
        holder.textView.text = context.resources.getString(item.stringResource)
        holder.imageView.setImageResource(item.imageResourceId)

        if (position == 0) {
            holder.imageView.setOnClickListener {
                val intent = Intent(context, TourguideDescription::class.java)

                context.startActivity(intent)
            }
        }

      if (position == 1) {
          holder.imageView.setOnClickListener {
              val intent = Intent(context, DescriptionActivity::class.java)

              context.startActivity(intent)
          }
      }
        if (position == 2) {
            holder.imageView.setOnClickListener {
                val intent = Intent(context, FestivalsDescription::class.java)

                context.startActivity(intent)
            }
        }
        if (position == 3) {
            holder.imageView.setOnClickListener {
                val intent = Intent(context, ArtDescription::class.java)

                context.startActivity(intent)
            }
        }

        if (position == 4) {
            holder.imageView.setOnClickListener {
                val intent = Intent(context, CuisinesDescription::class.java)

                context.startActivity(intent)
            }
        }
        if (position == 5) {
            holder.imageView.setOnClickListener {
                val intent = Intent(context, RecreationDescription::class.java)

                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
    class HomeViewHolder(view:View):RecyclerView.ViewHolder(view){
        val textView : TextView = view.findViewById(R.id.tv_news_feed)
        val imageView : ImageView = view.findViewById(R.id.img_news_feed)
       //val content11: LinearLayout = view.findViewById(R.id.content_ll)

    }
}


