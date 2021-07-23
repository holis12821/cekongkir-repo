/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 23/7/21 20:23 PM
 * Last modified 23/7/21 20:24 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class OriginDetails(
     @SerializedName("city_id")
     var city_id: String? = null,
     @SerializedName("city_name")
     var city_name: String? = null,
     @SerializedName("postal_code")
     var postal_code: String? = null,
     @SerializedName("province")
     var province: String? = null,
     @SerializedName("province_id")
     var province_id: String? = null,
     @SerializedName("type")
     var type: String? = null
)
