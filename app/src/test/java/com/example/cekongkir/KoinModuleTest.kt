package com.example.cekongkir

import org.junit.Test
import org.koin.dsl.koinApplication
import org.koin.test.check.checkModules
import org.koin.test.AutoCloseKoinTest
class KoinModuleTest: AutoCloseKoinTest() {
    @Test
    fun testCoreModule() {
        koinApplication {
            
        }
    }
}