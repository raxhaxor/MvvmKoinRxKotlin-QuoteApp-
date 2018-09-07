package com.example.root.mvvmkoinrxkotlin.quotes.usecase.cases

import io.reactivex.Observable


/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:34.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
interface QuoteGetUseCase {
    fun getQuote(): Observable<String>
}