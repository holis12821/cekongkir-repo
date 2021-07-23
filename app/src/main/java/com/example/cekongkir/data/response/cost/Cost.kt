package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class Cost(
    @SerializedName("cost")
    var cost: List<CostX>? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("service")
    var service: String? = null
)
