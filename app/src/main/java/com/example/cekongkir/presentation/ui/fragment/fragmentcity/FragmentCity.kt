/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:34 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.fragment.fragmentcity

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cekongkir.R

class FragmentCity : Fragment() {

    companion object {
        fun newInstance() = FragmentCity()
    }

    private lateinit var viewModel: FragmentCityViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentCityViewModel::class.java)
        // TODO: Use the ViewModel
    }

}