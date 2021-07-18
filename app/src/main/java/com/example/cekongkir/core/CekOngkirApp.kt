/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:33 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.core

import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.example.cekongkir.di.networkModule
import com.example.cekongkir.di.repositoryModule
import com.example.cekongkir.di.useCaseModule
import com.example.cekongkir.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

/**
 *Level Application in android apps
 * in this class extended
 * @see MultiDexApplication : when your app and the libraries it references
 * exceed method 65,536 a build error will appear indicating that the app
 * has reached the android build architecture limit. to overcome this using
 * MultidexApplication.*/
class CekOngkirApp: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        mInstance = this
        MultiDex.install(this)
        Timber.plant(Timber.DebugTree())

        /*Start koin with adding module from dependency*/
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@CekOngkirApp)
            modules(
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        }
    }

    fun getInstance(): CekOngkirApp? {
        if (mInstance == null) {
            synchronized(CekOngkirApp::class.java) { mInstance == CekOngkirApp() }
        }
        return mInstance
    }

    companion object {
        private var mInstance: CekOngkirApp? = null
    }
}