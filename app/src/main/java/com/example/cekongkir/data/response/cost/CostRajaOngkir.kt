/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 24/7/21 19:47 PM
 * Last modified 24/7/21 19:47 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.example.cekongkir.data.response.Status
import com.google.gson.annotations.SerializedName

data class CostRajaOngkir(
    @SerializedName("destination_details")
    var destination_details: DestinationDetails? = null,
    @SerializedName("origin_details")
    var origin_details: OriginDetails? = null,
    @SerializedName("query")
    var query: Query? = null,
    @SerializedName("results")
    var results: List<Results>? = null,
    @SerializedName("status")
    var status: Status? = null
)
