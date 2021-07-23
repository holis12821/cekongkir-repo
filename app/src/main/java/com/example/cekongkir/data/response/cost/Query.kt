/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 23/7/21 20:08 PM
 * Last modified 23/7/21 20:08 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("courier")
    var courier: String? = null,
    @SerializedName("destination")
    var destination: String? = null,
    @SerializedName("destinationType")
    var destinationType: String?= null,
    @SerializedName("origin")
    var origin: String? = null,
    @SerializedName("originType")
    var originType: String? = null,
    @SerializedName("weight")
    var weight: Int? = null
)
