package com.example.root.mvvmkoinrxkotlin.quotes.usecase.impl

import com.example.root.mvvmkoinrxkotlin.quotes.repository.repo.QuoteFetchRepo
import com.example.root.mvvmkoinrxkotlin.quotes.usecase.cases.QuoteGetUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:45.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
class QuoteGetCaseImpl(private val quoteFetchRepo: QuoteFetchRepo) : QuoteGetUseCase {

    override fun getQuote(): Observable<String> {
        return Observable.interval(3, TimeUnit.SECONDS)
                .flatMapSingle { quoteFetchRepo.fetchQuote() }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}