package com.example.cekongkir.data.response.city

import com.google.gson.annotations.SerializedName

data class Results(
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
