package com.example.cekongkir.data.response.subdistrict

import com.google.gson.annotations.SerializedName

data class Results(
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
