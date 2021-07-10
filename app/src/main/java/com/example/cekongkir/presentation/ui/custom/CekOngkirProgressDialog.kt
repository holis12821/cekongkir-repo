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