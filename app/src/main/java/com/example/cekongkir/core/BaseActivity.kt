/**
 * Cek Ongkir Android Apps
 * Copyright (c) 2021. All rights reserved.
 * Created by Nurholis on 4/7/21 01:07 AM
 * Last modified 10/7/21 02:32 AM by Nurholis
 * Licensed under the Apache Licence, Version 2.0
 * May not copy files in their entirety for either distribution or
 * rewriting of source code.*/
package com.example.cekongkir.core

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding

/**
 * This BaseActivity class is used for activity that using view
 * and data binding by extending this class will have common function for
 * binding the view.
 * For extend this class we need two parameter
 * @param B for view data binding and
 * @ViewDataBinding is both parameter required and can't
 * set to null. This parameter is generic constraint type parameter which
 * is used to restrict what generic types to attach.
 * This Generic type is the same of Bounded Parameter Type in Java*/
abstract class BaseActivity<B : ViewDataBinding>: AppCompatActivity() {

}