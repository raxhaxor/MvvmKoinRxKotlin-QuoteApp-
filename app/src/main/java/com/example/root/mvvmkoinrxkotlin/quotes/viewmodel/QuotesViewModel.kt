package com.example.root.mvvmkoinrxkotlin.quotes.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.root.mvvmkoinrxkotlin.quotes.usecase.cases.QuoteGetUseCase
import com.example.root.mvvmkoinrxkotlin.quotes.viewmodel.status.QuoteStatus
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 10:27.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */
class QuotesViewModel(private val useCase: QuoteGetUseCase) : ViewModel() {

    private val disposable by lazy { CompositeDisposable() }
    private val quote: MutableLiveData<QuoteStatus> by
    lazy { MutableLiveData<QuoteStatus>() }


    fun getObservableToastList(): MutableLiveData<QuoteStatus> {
        return quote
    }

    fun getQuote() {
        disposable.add(useCase.getQuote()
                .subscribe({
                    quote.value = QuoteStatus.Success(it)
                }, {
                    quote.value = QuoteStatus.Error(it.localizedMessage)
                }))
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }

}