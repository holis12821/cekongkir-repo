/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 25/7/21 14:41 PM
 * Last modified 25/7/21 14:41 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir

import com.example.cekongkir.di.networkModule
import com.example.cekongkir.di.repositoryModule
import com.example.cekongkir.di.useCaseModule
import com.example.cekongkir.di.viewModelModule
import org.junit.Test
import org.koin.core.logger.Level
import org.koin.dsl.koinApplication
import org.koin.test.KoinTest
import org.koin.test.check.checkModules

class KoinModuleTest: KoinTest {
    @Test
    fun testCoreModule() {
        koinApplication {
           printLogger(Level.DEBUG)
            modules(
                listOf(
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }.checkModules()
    }
}