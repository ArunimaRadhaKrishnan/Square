package com.example.aeth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var name = arrayOf("a","b","c","d")
    private  var details = arrayOf("asdfg","khnkilhio","kghjk","kjhlkh")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val  v=LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text=name[position]
        holder.itemDetail.text=details[position]
    }
    inner class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemTitle= itemView.findViewById(R.id.name)
            itemDetail =itemView.findViewById(R.id.details)
        }


    }
}