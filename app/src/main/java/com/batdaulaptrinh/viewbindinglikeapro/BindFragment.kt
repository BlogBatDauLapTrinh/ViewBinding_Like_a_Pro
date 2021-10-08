package com.batdaulaptrinh.viewbindinglikeapro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.batdaulaptrinh.viewbindinglikeapro.databinding.FragmentBindBinding

class BindFragment : Fragment(R.layout.fragment_bind) {
    var _binding:FragmentBindBinding? = null
    val binding get()= _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBindBinding.bind(view)
        binding.bindFragmentTxt.text = "Set bind fragment successfully"
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

}