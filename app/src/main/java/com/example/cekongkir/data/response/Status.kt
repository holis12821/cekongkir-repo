/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 24/7/21 19:46 PM
 * Last modified 24/7/21 19:46 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response

import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("code")
    var code: Int,
    @SerializedName("description")
    var description: String
)
