package com.example.cekongkir.data.response.waybill

import com.google.gson.annotations.SerializedName

data class Details(
    @SerializedName("destination")
    var destination: String? = null,
    @SerializedName("origin")
    var origin: String? = null,
    @SerializedName("receiver_address1")
    var receiver_address1: String? = null,
    @SerializedName("receiver_address2")
    var receiver_address2: String? = null,
    @SerializedName("receiver_address3")
    var receiver_address3: String? = null,
    @SerializedName("receiver_city")
    var receiver_city: String? = null,
    @SerializedName("receiver_name")
    var receiver_name: String? = null,
    @SerializedName("shipper_address1")
    var shipper_address1: String? = null,
    @SerializedName("shipper_address2")
    var shipper_address2: String? = null,
    @SerializedName("shipper_address3")
    var shipper_address3: String? = null,
    @SerializedName("shipper_city")
    var shipper_city: String? = null,
    @SerializedName("shippper_name")
    var shippper_name: String? = null,
    @SerializedName("waybill_date")
    var waybill_date: String? = null,
    @SerializedName("waybill_number")
    var waybill_number: String? = null,
    @SerializedName("waybill_time")
    var waybill_time: String? = null,
    @SerializedName("weight")
    var weight: String
)
