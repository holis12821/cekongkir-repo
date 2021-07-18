/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 11/7/21 23:34 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.activity.splashscreen

import android.content.Intent
import android.os.Bundle
import com.example.cekongkir.R
import com.example.cekongkir.core.BaseActivity
import com.example.cekongkir.databinding.ActivitySplashScreenBinding
import com.example.cekongkir.presentation.ui.activity.home.MainActivityHome

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>() {

    override fun getResLayoutId(): Int = R.layout.activity_splash_screen

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        showSplashScreen()
    }

    private fun showSplashScreen() {
        setLoadingTimer()
    }

    private fun setLoadingTimer() {
        object : Thread() {
            override fun run() {
                try {
                    sleep(3_000)
                    val intent = Intent(this@SplashScreenActivity,
                    MainActivityHome::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }.start()
    }
}