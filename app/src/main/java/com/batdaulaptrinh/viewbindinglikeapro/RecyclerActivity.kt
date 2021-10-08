package com.batdaulaptrinh.viewbindinglikeapro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.batdaulaptrinh.viewbindinglikeapro.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_recycler)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.adapter = RecyclerListAdapter(ListItem.getListItem())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}