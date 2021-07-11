/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 11/7/21 00:18 AM
 * Last modified 11/7/21 03:28 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.custom

import android.app.Activity
import android.content.Context
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import com.example.cekongkir.R
/**
 * This class custom the Positive Toast to display messages*/
class CekOngkirToast(
  context: Context
) : Toast(context) {

    fun showPositiveToast(activity: Activity,  message: String) {
        val layout = activity.layoutInflater.inflate(
            R.layout.layout_custom_toast,
            activity.findViewById(R.id.toast_container)
        )

        /** Set the text of the TextView to displaying messages*/
        val messageToast = layout.findViewById<TextView>(R.id.toast_text)
        messageToast.text = message

        //use the application extension function is common function
        this.apply {
            setGravity(Gravity.TOP, 0, 0)
            duration = LENGTH_SHORT
            view = layout
            show()
        }
    }

    fun showToastDanger(activity: Activity, message: String) {
        val layout = activity.layoutInflater.inflate(
            R.layout.layout_custom_toast_danger,
            activity.findViewById(R.id.toast_container_danger)
        )

        /** Set the text of the TextView to displaying messages*/
        val messageToast = layout.findViewById<TextView>(R.id.toast_text_danger)
        messageToast.text = message

        //use the application extension function is common function
        this.apply {
            setGravity(Gravity.TOP, 0, 0)
            duration = LENGTH_LONG
            view = layout
            show()
        }
    }
}