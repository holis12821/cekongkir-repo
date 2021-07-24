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
