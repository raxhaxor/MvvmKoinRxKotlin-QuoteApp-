package com.example.root.mvvmkoinrxkotlin.quotes.view.util

import android.content.Context
import android.view.Gravity
import android.widget.Toast

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 12:00.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */

fun Context.toast(msg: String) {
    Toast.makeText(this, msg, Toast.LENGTH_LONG)
            .apply { setGravity(Gravity.CENTER, 0, 0) }
            .show()
}