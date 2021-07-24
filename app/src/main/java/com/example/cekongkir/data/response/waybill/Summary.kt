package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class Summary(
    @SerializedName("courier_code")
    var courier_code: String,
    @SerializedName("courier_name")
    var courier_name: String,
    @SerializedName("destination")
    var destination: String,
    @SerializedName("origin")
    var origin: String,
    @SerializedName("receiver_name")
    var receiver_name: String,
    @SerializedName("service_code")
    var service_code: String,
    @SerializedName("shipper_name")
    var shipper_name: String,
    @SerializedName("status")
    var status: String,
    @SerializedName("waybill_date")
    var waybill_date: String,
    @SerializedName("waybill_number")
    var waybill_number: String
)
