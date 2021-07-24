package com.example.cekongkir.di

import com.example.cekongkir.data.network.ServiceDataSource
import com.example.cekongkir.domain.repository.CekOngkirRepository
import com.example.cekongkir.domain.repository.CekOngkirRepositoryImpl
import org.koin.dsl.module
import retrofit2.Retrofit

val repositoryModule = module {
    single { provideCekOngkirDataSource(get()) }
    single { provideCekOngkirRepository(get()) }

}

fun provideCekOngkirDataSource(retrofit: Retrofit): ServiceDataSource {
    return retrofit.create(ServiceDataSource::class.java)
}

fun provideCekOngkirRepository(dataSource: ServiceDataSource): CekOngkirRepository {
    return CekOngkirRepositoryImpl(dataSource)
}

