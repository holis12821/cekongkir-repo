/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 11/7/21 03:28 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.custom

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import com.example.cekongkir.R

class CekOngkirProgressDialog(
    context: Context
): Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cek_ongkir_progress_dialog)
        window?.setBackgroundDrawableResource(android.R.color.transparent)
    }
}