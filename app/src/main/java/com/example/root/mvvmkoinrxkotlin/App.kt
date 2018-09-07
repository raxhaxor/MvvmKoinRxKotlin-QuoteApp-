package com.example.root.mvvmkoinrxkotlin

import android.app.Application
import com.example.root.mvvmkoinrxkotlin.di.viewModel
import org.koin.android.ext.android.startKoin

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:23.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
class App : Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(viewModel))
    }

}