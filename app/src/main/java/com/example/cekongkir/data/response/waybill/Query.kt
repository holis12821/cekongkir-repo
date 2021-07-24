/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 24/7/21 20:15 PM
 * Last modified 24/7/21 20:15 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("courier")
    var courier: String? = null,
    @SerializedName("waybill")
    var waybill: String? = null
)
