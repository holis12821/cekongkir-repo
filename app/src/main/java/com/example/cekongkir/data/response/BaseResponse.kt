/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 19/7/21 08:44 AM
 * Last modified 20/7/21 06:07 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response

import com.google.gson.annotations.SerializedName

/**
 * This class is used for mapping api response which's have
 * status and data.
 * @param rajaongkir is response data with generic parameter type of T
 * */
data class BaseResponse<T>(
    @SerializedName("rajaongkir")
    var rajaongkir: T? = null
)
