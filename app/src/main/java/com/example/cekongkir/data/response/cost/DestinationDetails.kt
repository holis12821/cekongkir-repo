/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 24/7/21 19:47 PM
 * Last modified 24/7/21 19:47 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class DestinationDetails(
    @SerializedName("city")
    var city: String,
    @SerializedName("city_id")
    var city_id: String,
    @SerializedName("province")
    var province: String,
    @SerializedName("province_id")
    var province_id: String,
    @SerializedName("subdistrict_id")
    var subdistrict_id: String,
    @SerializedName("subdistrict_name")
    var subdistrict_name: String,
    @SerializedName("type")
    var type: String
)
