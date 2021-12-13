package com.abbasov.picassoadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abbasov.picassoadapters.databinding.ItemRvBinding
import com.squareup.picasso.Picasso

class userAdapter (val context: Context, val list:ArrayList<Item>): RecyclerView.Adapter<userAdapter.Vh>(){
    inner class Vh( val itemRv: ItemRvBinding): RecyclerView.ViewHolder(itemRv.root){
        fun onBind(i: Item, position: Int){
            Picasso.get().load(i.image).into(itemRv.image)
            itemRv.name.text=i.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userAdapter.Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: userAdapter.Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}