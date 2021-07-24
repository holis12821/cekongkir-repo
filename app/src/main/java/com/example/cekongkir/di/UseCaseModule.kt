package com.example.cekongkir.di

import com.example.cekongkir.domain.usecase.UseCaseCekOngkir
import org.koin.dsl.module

val useCaseModule = module {
    single { UseCaseCekOngkir(get()) }
}