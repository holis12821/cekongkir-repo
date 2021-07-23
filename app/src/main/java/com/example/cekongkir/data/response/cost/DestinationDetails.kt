/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 20/7/21 06:08 AM
 * Last modified 20/7/21 06:08 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class DestinationDetails(
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("city_id")
    var city_id: String? = null,
    @SerializedName("province")
    var province: String? = null,
    @SerializedName("province_id")
    var province_id: String? = null,
    @SerializedName("subdistrict_id")
    var subdistrict_id: String? = null,
    @SerializedName("subdistrict_name")
    var subdistrict_name: String? = null,
    @SerializedName("type")
    var type: String? = null

)
