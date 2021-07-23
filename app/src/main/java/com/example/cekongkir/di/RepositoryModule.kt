/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 19/7/21 08:45 AM
 * Last modified 19/7/21 08:45 AM by Nurholis.
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.di

import com.example.cekongkir.data.network.ServiceDataSource
import com.example.cekongkir.domain.repository.Repository
import com.example.cekongkir.domain.repository.RepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val repositoryModule = module {
    single { provideServiceDataSource(get()) }
    single { provideRepository(get()) }
}
  fun provideServiceDataSource(retrofit: Retrofit): ServiceDataSource {
      return retrofit.create(ServiceDataSource::class.java)
  }

  fun provideRepository(dataSource: ServiceDataSource): Repository {
      return RepositoryImpl(dataSource)
  }