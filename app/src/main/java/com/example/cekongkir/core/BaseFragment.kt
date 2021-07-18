/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:32 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.core

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.cekongkir.presentation.ui.custom.CekOngkirProgressDialog
import com.example.cekongkir.presentation.ui.custom.CekOngkirToast

/**
 * This base fragment class is used for fragment that using view
 * and data binding. By extending this class will have common
 * function for binding the view.
 * for extended this class we need two parameters :
 * @see ViewDataBinding
 * @param B for view data binding.
 * */
abstract class BaseFragment<B : ViewDataBinding>: Fragment() {

    /**
     * This variable is used for showing Toast Positive and Error
     * to displaying messages*/
    private lateinit var cekOngkirToast: CekOngkirToast

    /**
     * This variable used for binding the view*/
    private lateinit var binding: B

    /**
     * This function is used for set the view layout
     * and add annotation @LayoutRes*/
    @LayoutRes
    protected abstract fun getResLayoutId(): Int

    //Define progress dialog
    private lateinit var progressDialog: CekOngkirProgressDialog

    /**
     * @see onViewCreated This function is used for set
     * the action when the view was created*/
    protected abstract fun onViewCreated()

    /**
     * This function is used for init all function when fragment is created.
     * There're have function for binding the view with data binding.
     * @see onCreateView is a function when layout on fragment is attach
     * or if not attachment in the layout then it won't run the
     * @see onViewCreated function.
     * @see getViewLifecycleOwner called when in a fragment, which fragment
     * will follow the lifecycle of the activity.
     *  @LifeCycleOwner is an interface that shows that this class
     * has a lifecycle such as an activity or a fragment.
     * so the activity or fragment implements a
     * @LifeCycleOwner, then the activity and fragment have properties that
     * are owned by the interface, so they have a lifecycle.*/
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate<B>(inflater,
                getResLayoutId(), container, false)
                .apply {
                    lifecycleOwner = this@BaseFragment
                }

        activity?.let {
            cekOngkirToast = CekOngkirToast(it)
        }

        activity?.let {
            progressDialog = CekOngkirProgressDialog(it)
        }

        onViewCreated()
        return binding.root
    }

    /**
     * this function displaying Toast Positive Messages*/
    fun showPositiveToast(activity: Activity, message: () -> String) {
        if (message.invoke() == "") return
        else cekOngkirToast.showPositiveToast(activity, message.invoke())
    }
    /**
     * this function displaying Toast Error Messages*/
    fun showToastDanger(activity: Activity, message: () -> String) {
        if (message.invoke() == "") return
        else cekOngkirToast.showToastDanger(activity, message.invoke())
    }

    fun showDialogProgress(): CekOngkirProgressDialog {
        try {
            progressDialog.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return progressDialog
    }

    /**
     * This function hiding progress loading dialog*/
    fun showHideProgress() {
        try {
            progressDialog.dismiss()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}