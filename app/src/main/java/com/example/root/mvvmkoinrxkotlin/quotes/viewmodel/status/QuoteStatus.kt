package com.example.root.mvvmkoinrxkotlin.quotes.viewmodel.status

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:41.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
sealed class QuoteStatus {
    data class Success(val data: String) : QuoteStatus()
    data class Error(val message: String) : QuoteStatus()
}