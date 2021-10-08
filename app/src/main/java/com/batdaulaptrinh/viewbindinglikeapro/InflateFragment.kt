package com.batdaulaptrinh.viewbindinglikeapro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.batdaulaptrinh.viewbindinglikeapro.databinding.FragmentInflateBinding

class InflateFragment : Fragment(R.layout.fragment_inflate) {
    private var _binding:FragmentInflateBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInflateBinding.inflate(inflater,container,false)
        binding.inflateFragmentTxt.text = "inflate fragment successfully"
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}