package com.batdaulaptrinh.viewbindinglikeapro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.batdaulaptrinh.viewbindinglikeapro.base.BaseFragment
import com.batdaulaptrinh.viewbindinglikeapro.databinding.FragmentBindBinding

class BindFragment : BaseFragment<FragmentBindBinding>() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.bindFragmentTxt.text = "Set bind fragment successfully"
    }
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentBindBinding = FragmentBindBinding.inflate(layoutInflater,container,false)
}