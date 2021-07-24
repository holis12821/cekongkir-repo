package com.example.cekongkir.di

import com.example.cekongkir.presentation.ui.fragment.fragmentcity.FragmentCityViewModel
import com.example.cekongkir.presentation.ui.fragment.fragmentcity.FragmentCityViewState
import org.koin.dsl.module

val viewModelModule = module {
    single { FragmentCityViewModel(get()) }
}