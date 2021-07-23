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

data class Summary(
    @SerializedName("courier_code")
    var courier_code: String? = null,
    @SerializedName("courier_name")
    var courier_name: String? = null,
    @SerializedName("destination")
    var destination: String? = null,
    @SerializedName("origin")
    var origin: String? = null,
    @SerializedName("receiver_name")
    var receiver_name: String? = null,
    @SerializedName("service_code")
    var service_code: String? = null,
    @SerializedName("shipper_name")
    var shipper_name: String? = null,
    @SerializedName("status")
    var status: String? = null,
    @SerializedName("waybill_date")
    var waybill_date: String? = null,
    @SerializedName("waybill_number")
    var waybill_number: String? = null
)
