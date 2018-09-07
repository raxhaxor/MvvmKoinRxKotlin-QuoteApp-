package com.example.root.mvvmkoinrxkotlin.quotes.repository.repo

import io.reactivex.Single

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:47.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
interface QuoteFetchRepo {
    fun fetchQuote(): Single<String>
}