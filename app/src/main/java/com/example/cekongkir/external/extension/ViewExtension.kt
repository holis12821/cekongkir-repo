/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 16:26 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.external.extension

import android.app.Activity
import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.cekongkir.presentation.ui.custom.CekOngkirToast

/**
 * This ViewExtension contains general extension
 * properties and methods.*/

/**This extension properties is common properties or variable*/
inline var View.viewGone: Boolean
    get() = visibility == View.GONE
    set(value) {
        visibility = if (value) View.GONE else View.VISIBLE
    }

inline var View.viewVisible: Boolean
    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

fun convertDpToPixels(context: Context, dp: Int): Int = (dp * context.resources.displayMetrics.density).toInt()

fun convertPixelsToDp(context: Context, px: Int) = (px / context.resources.displayMetrics.density).toInt()

fun SwipeRefreshLayout.swipeVisible() {
    isRefreshing = true
}

fun SwipeRefreshLayout.swipeGone() {
    isRefreshing = false
}

fun RecyclerView.setUpLinearLayoutManager(@RecyclerView.Orientation orientation: Int) {
    layoutManager = LinearLayoutManager(context, orientation, false)
}

fun RecyclerView.setUpGridLayoutManager(column: Int) {
    layoutManager = GridLayoutManager(context, column)
}

fun RecyclerView.setUpHorizontalLayoutManager() {
    layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
}

fun RecyclerView.setUpVerticalLayoutManager() {
    layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
}