package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class Manifest(
    @SerializedName("city_name")
    var city_name: String? = null,
    @SerializedName("manifest_date")
    var manifest_date: String? = null,
    @SerializedName("manifest_description")
    var manifest_description: String? = null,
    @SerializedName("manifest_time")
    var manifest_time: String? = null
)
