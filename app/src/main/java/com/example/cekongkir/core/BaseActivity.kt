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
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.cekongkir.presentation.ui.custom.CekOngkirProgressDialog
import com.example.cekongkir.presentation.ui.custom.CekOngkirToast

/**
 * This BaseActivity class is used for activity that using view
 * and data binding by extending this class will have common function for
 * binding the view.
 * For extend this class we need two parameter
 * @param B for view data binding and
 * @ViewDataBinding is both parameter required and can't
 * set to null. This parameter is generic constraint type parameter which
 * is used to restrict what generic types to attach.
 * This Generic type is the same of Bounded Parameter Type in Java
 * To see documentation on my projects please visit
 * @see "https://github.com/holis12821/cekongkir-repo" on my github*/
abstract class BaseActivity<B : ViewDataBinding>: AppCompatActivity() {

    /**
     * This variable is used for showing Toast Positive and Error
     * to displaying messages*/
    private lateinit var cekOngkirToast: CekOngkirToast

    /**
     * This variable is use for binding the view*/
    private lateinit var binding: B
    /**
     * This function is used for set the view layout*/
    @LayoutRes
    protected abstract fun getResLayoutId(): Int
    //define progress dialog
    private lateinit var progressDialog: CekOngkirProgressDialog

    /**
     *This function used for set the action
     * when the activity was created*/
    protected abstract fun onActivityCreated(savedInstanceState: Bundle?)

    /**
     * This function is used for init all function some think like that
     * when activity is read to layout and next to call function
     * @onActivityCreated.
     * There're have function for binding the view with data binding.
     * @onCreate this function will be executed when the layout
     * of the activity has been attach to the activity.
     * @lifeCycleOwner is an interface that shows that this class
     * has a lifecycle such as an activity or a fragment.
     * so the activity or fragment implements a
     * @LifeCycleOwner, then the activity and fragment have properties that
     * are owned by the interface, so they have a lifecycle*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding view is here
        binding = DataBindingUtil.setContentView<B>(this, getResLayoutId())
            .apply {
                lifecycleOwner = this@BaseActivity
            }
        cekOngkirToast = CekOngkirToast(this)
        progressDialog = CekOngkirProgressDialog(this)
        onActivityCreated(savedInstanceState)
    }

    /**
     * this function displaying Toast Positive Messages and Error Messages*/
    protected fun showPositiveToast(activity: Activity, message: () -> String) {
        cekOngkirToast.showPositiveToast(activity, message.invoke())
    }

    protected fun showToastDanger(activity: Activity, message: () -> String) {
        cekOngkirToast.showToastDanger(activity, message.invoke())
    }

    protected fun showDialogProgress(): CekOngkirProgressDialog {
        try {
            progressDialog.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return progressDialog
    }

  protected fun hideProgress() {
        try {
            progressDialog.dismiss()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}