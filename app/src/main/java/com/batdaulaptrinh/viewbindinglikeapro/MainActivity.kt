package com.batdaulaptrinh.viewbindinglikeapro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batdaulaptrinh.viewbindinglikeapro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityTxt.text = "Main activity set successfully"
        binding.goToRecyclerBtn.setOnClickListener{
            startActivity(Intent(this,RecyclerActivity::class.java))
        }
    }
}