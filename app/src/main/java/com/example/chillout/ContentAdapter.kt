package com.example.chillout

import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*


class ContentAdapter(private val context: Context, private val items: List<series_list>) : RecyclerView.Adapter<ContentAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentAdapter.MyViewHolder {
            val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
            return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContentAdapter.MyViewHolder, position: Int) {
        val artist = items[position]
        holder.setData(artist, position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currentItem: series_list? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                Toast.makeText(context, currentItem!!.title + " Clicked !", Toast.LENGTH_SHORT).show()
            }

            itemView.imgShare.setOnClickListener {

                val message: String =  currentItem!!.title

                val intent = Intent(Intent.ACTION_WEB_SEARCH)
                val keyword = message
                intent.putExtra(SearchManager.QUERY, keyword)
                context.startActivity(intent)
            }
        }

        fun setData(item: series_list?, pos: Int) {
            itemView.txvTitle.text = item!!.title

            this.currentItem = item
            this.currentPosition = pos
        }
    }
}