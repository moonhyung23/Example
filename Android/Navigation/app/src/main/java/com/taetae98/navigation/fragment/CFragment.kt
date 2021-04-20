package com.taetae98.navigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.taetae98.navigation.R
import com.taetae98.navigation.base.BaseFragment
import com.taetae98.navigation.databinding.FragmentCBinding
import com.taetae98.navigation.utility.DataBinding

class CFragment : BaseFragment(), DataBinding<FragmentCBinding> {
    override val binding: FragmentCBinding by lazy { DataBinding.get(this, R.layout.fragment_c) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        super.onCreateView(inflater, container, savedInstanceState)
        onCreateVewDataBinding()
        onCreateOnMove()

        return binding.root
    }

    private fun onCreateVewDataBinding() {
        binding.lifecycleOwner = this
    }

    private fun onCreateOnMove() {
        binding.setOnMove {
            findNavController().navigate(CFragmentDirections.actionCFragmentToDFragment())
        }
    }
}