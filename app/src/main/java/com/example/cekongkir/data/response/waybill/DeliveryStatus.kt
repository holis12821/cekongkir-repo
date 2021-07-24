package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class DeliveryStatus(
    @SerializedName("pod_date")
    var pod_date: String? = null,
    @SerializedName("pod_receiver")
    var pod_receiver: String? = null,
    @SerializedName("pod_time")
    var pod_time: String? = null,
    @SerializedName("status")
    var status: String? = null
)