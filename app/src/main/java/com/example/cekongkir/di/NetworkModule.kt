/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 24/7/21 21:06 PM
 * Last modified 24/7/21 21:06 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.di

import com.example.cekongkir.BuildConfig
import com.example.cekongkir.external.constant.networkConnectTimeOut
import com.example.cekongkir.external.constant.networkReadTimeOut
import com.example.cekongkir.external.constant.networkWriteTimeout
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single { provideHttpLoggingInterceptor() }
    single { provideOkHttpClient(get()) }
    single { provideConverterFactory() }
    single {
        val baseUrl = BuildConfig.BASE_URL
        provideRetrofitInstance(get(), get(), baseUrl)
    }
}

fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
    val interceptor = HttpLoggingInterceptor()
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    return interceptor
}

fun provideOkHttpClient(
    loggingInterceptor: HttpLoggingInterceptor
): OkHttpClient {
    return OkHttpClient.Builder()
        .connectTimeout(networkConnectTimeOut, TimeUnit.SECONDS)
        .writeTimeout(networkWriteTimeout, TimeUnit.SECONDS)
        .readTimeout(networkReadTimeOut, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .build()
}

fun provideConverterFactory(): GsonConverterFactory = GsonConverterFactory.create()

fun provideRetrofitInstance(
    okHttpClient: OkHttpClient,
    gsonConverterFactory: GsonConverterFactory,
    baseUrl: String
): Retrofit = Retrofit.Builder()
    .baseUrl(baseUrl)
    .client(okHttpClient)
    .addConverterFactory(gsonConverterFactory)
    .build()