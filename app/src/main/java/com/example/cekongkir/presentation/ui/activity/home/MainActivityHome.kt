/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:34 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.activity.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cekongkir.R
import com.example.cekongkir.presentation.ui.fragment.fragmentcity.FragmentCity

class MainActivityHome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, FragmentCity.newInstance())
                    .commitNow()
        }
    }
}