package com.example.cekongkir.data.response.subdistrict

import com.example.cekongkir.data.response.Status
import com.google.gson.annotations.SerializedName

data class RajaOngkir(
    @SerializedName("query")
    var query: Query? = null,
    @SerializedName("results")
    var results: List<Results>? = null,
    @SerializedName("status")
    var status: Status? = null
)
