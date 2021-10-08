package com.batdaulaptrinh.viewbindinglikeapro

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.batdaulaptrinh.viewbindinglikeapro.databinding.SingleItemBinding

class RecyclerListAdapter(private val listItem:List<String>):RecyclerView.Adapter<RecyclerListAdapter.MyItemHolder>() {
    val TAG = javaClass.name
    inner class MyItemHolder(private val binding:SingleItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position:Int) {
            Log.i(TAG,listItem[position])
            binding.cardView.setBackgroundColor(Color.parseColor(listItem[position]))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemHolder {
        var binding = SingleItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyItemHolder((binding))
    }

    override fun onBindViewHolder(holder: MyItemHolder, position: Int) {
        holder.bind(position)    
    }

    override fun getItemCount() = listItem.size
}