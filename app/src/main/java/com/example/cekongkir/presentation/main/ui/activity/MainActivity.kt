/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 4/7/21 01:08 PM by Nurholis*/
package com.example.cekongkir.presentation.main.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cekongkir.R
import com.example.cekongkir.presentation.main.ui.fragment.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
    }
}