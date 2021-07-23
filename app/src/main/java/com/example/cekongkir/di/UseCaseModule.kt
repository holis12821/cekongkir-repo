/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 19/7/21 08:46 AM
 * Last modified 19/7/21 08:46 AM by Nurholis.
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.di

import com.example.cekongkir.domain.usecase.UseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { UseCase(get()) }
}