package com.example.test.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.R
import com.example.test.data.dataItem

class RecyclerAdapter internal constructor(context: Context?, dataItem: List<dataItem>):RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private val inflater: LayoutInflater
    private val dataItem: List<dataItem>

    init {
        this.dataItem = dataItem
        inflater = LayoutInflater.from(context)
    }

    class ViewHolder internal constructor(view: View):RecyclerView.ViewHolder(view){

        val imageName: ImageView
        val nameText: TextView
        val statusText: TextView
        val genderText: TextView
        val planetText: TextView
        init {
            imageName = view.findViewById(R.id.image_1)
            nameText = view.findViewById(R.id.name)
            statusText = view.findViewById(R.id.status)
            genderText = view.findViewById(R.id.gender)
            planetText = view.findViewById(R.id.planet)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = inflater.inflate(R.layout.item_test,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data: dataItem = dataItem[position]
        holder.imageName.setImageURI(data.url)
        holder.nameText.setText(data.name)
        holder.statusText.setText(data.status)
        holder.genderText.setText(data.gender)
        holder.planetText.setText(data.location)
    }

    override fun getItemCount(): Int {
        return dataItem.size
    }
}