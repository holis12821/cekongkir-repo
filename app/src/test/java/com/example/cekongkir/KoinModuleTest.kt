package com.example.cekongkir

import com.example.cekongkir.di.networkModule
import com.example.cekongkir.di.repositoryModule
import com.example.cekongkir.di.useCaseModule
import com.example.cekongkir.di.viewModelModule
import org.junit.Test
import org.koin.dsl.koinApplication
import org.koin.test.AutoCloseKoinTest
import org.koin.test.check.checkModules

class KoinModuleTest: AutoCloseKoinTest() {
    @Test
    fun testCoreModule() {
        koinApplication {
            printLogger(org.koin.core.logger.Level.DEBUG)
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