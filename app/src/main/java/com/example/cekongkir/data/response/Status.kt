package com.example.cekongkir.data.response

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("code")
    var code: Int? = null,
    @SerializedName("description")
    var description: String? = null
)
