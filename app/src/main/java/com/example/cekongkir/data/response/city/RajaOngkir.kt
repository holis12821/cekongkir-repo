/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 20/7/21 06:08 AM
 * Last modified 20/7/21 06:08 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.city

import com.example.cekongkir.data.response.Status
import com.google.gson.annotations.SerializedName
/**
 * @param query is response query for example, if you want to
 * parameterize the api endpoint which's usually used
 * to filter data or sort data.
 * @param results is response to handle data,
 * @param status is response status code from api*/
data class RajaOngkir(
        @SerializedName("query")
    var query: List<Any>? = null,
        @SerializedName("results")
    var results: List<Results>? = null,
        @SerializedName("status")
    var status: Status? = null
)
