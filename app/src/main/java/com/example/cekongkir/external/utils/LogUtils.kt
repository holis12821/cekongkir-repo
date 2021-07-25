/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 03:28 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.external.utils


import com.example.cekongkir.BuildConfig
import timber.log.Timber

object LogUtils {

    fun error(message: String) {
        if (BuildConfig.DEBUG) {
            Timber.e(message)
        }
    }

    fun info(message: String) {
        if (BuildConfig.DEBUG) {
            Timber.i(message)
        }
    }

    fun print(throwable: Throwable?) {
        if (BuildConfig.DEBUG) {
            throwable?.printStackTrace()
        }
    }
}