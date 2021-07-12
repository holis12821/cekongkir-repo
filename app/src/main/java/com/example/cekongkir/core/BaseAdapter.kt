/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * @author Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:32 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0 (the "License");
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.core

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

/**
 * This base class is used for RecyclerView Adapter.
 * By extending this class will have common function for binding
 * the view. For extend this class we need four parameter such as :
 * @param B for view data binding,
 * @param H for RecyclerView ViewHolder.
 * The params a Bounded Parameters Type in Java
 * or Constraint Type Parameter in Kotlin.
 * @see ViewDataBinding is both parameter which is the constraint type parameter and
 * @see RecyclerView.ViewHolder is the 4th parameter also constraint type parameter.
 * all parameters is required and can't set a null.
 * If the set the null maybe NullPointerException will haunt you.
 * The generic parameters will be given or attached an instance of
 * the corresponding parameter type according to what we want,
 * then the parameter type will automatically become the base type in the class*/
abstract class BaseAdapter<B: ViewDataBinding, H: RecyclerView.ViewHolder> :
        RecyclerView.Adapter<H>() {
        /**
         * This function is used for set the view layout*/
    @LayoutRes
    protected abstract fun getResLayoutId(): Int

    /**
     * This function is used set the Recyclerview ViewHolder*/
    protected abstract fun getViewHolder(binding: B): H

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): H {
       return getViewHolder(
               DataBindingUtil.inflate(
                       LayoutInflater.from(parent.context),
                       getResLayoutId(),
                       parent,
                       false
               )
       )
    }
    /**
     * This function is used for set empty function in onBind viewHolder*/
    override fun onBindViewHolder(holder: H, position: Int) {}
}