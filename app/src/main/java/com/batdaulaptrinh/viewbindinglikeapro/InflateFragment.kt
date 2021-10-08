package com.batdaulaptrinh.viewbindinglikeapro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.batdaulaptrinh.viewbindinglikeapro.base.BaseFragment
import com.batdaulaptrinh.viewbindinglikeapro.databinding.FragmentInflateBinding

class InflateFragment : BaseFragment<FragmentInflateBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.inflateFragmentTxt.text = "Inflate fragment successfully"
    }
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentInflateBinding = FragmentInflateBinding.inflate(inflater,container,false)


}