/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 23/7/21 21:52 PM
 * Last modified 23/7/21 21:52 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.data.response.cost

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("costs")
    var costs: List<Cost>? = null,
    @SerializedName("name")
    var name: String?= null
)
