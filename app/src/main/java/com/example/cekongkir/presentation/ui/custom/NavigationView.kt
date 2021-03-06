 /**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 13/7/21 21:03 PM
 * Last modified 13/7/21 21:03 PM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.presentation.ui.custom

import android.app.Activity
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.example.cekongkir.R

 /**
 * This class to make custom Navigation View such as back menu and title
 * in this application*/
class NavigationView (activity: Activity, var view: View? = null) {
    init {
        view = activity.window.decorView.rootView
    }

   fun setupNavIcon(icon: Int): NavigationView {
        val navigationBackIcon = view?.findViewById<AppCompatImageView?>(R.id.navigation_back)
            navigationBackIcon?.apply {
                setImageResource(icon)
            }
        return this
    }

    fun setupTitle(title: String?): NavigationView {
        val navigationTitle = view?.findViewById<AppCompatTextView?>(R.id.navigation_title)
            navigationTitle?.let {
                if (title == "" || title == null) return@let
                else it.text = title
            }
        return this
    }

    fun setNavigation(callback: (Any) -> Unit): NavigationView {
        val navigationCallBack = view?.findViewById<AppCompatImageView>(R.id.navigation_back)
            navigationCallBack?.setOnClickListener {
                callback.invoke(it)
            }
        return this
    }
}