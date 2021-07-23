/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 23/7/21 23:13 PM
 * Last modified 23/7/21 23:13 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("delivered")
    var delivered: Boolean? = null,
    @SerializedName("delivery_status")
    var delivery_status: DeliveryStatus? = null,
    @SerializedName("details")
    var details: Details? = null,
    @SerializedName("manifest")
    var manifest: List<Manifest>? = null,
    @SerializedName("summary")
    var summary: Summary? = null
)
