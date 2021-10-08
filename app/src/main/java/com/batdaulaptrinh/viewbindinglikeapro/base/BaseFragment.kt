package com.batdaulaptrinh.viewbindinglikeapro.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<V : ViewBinding> : Fragment() {
    private var _binding: V? = null
    protected val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = createViewBinding(inflater,container)
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    abstract fun createViewBinding(inflater: LayoutInflater,container: ViewGroup?): V
}