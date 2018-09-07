package com.example.root.mvvmkoinrxkotlin.di

import com.example.root.mvvmkoinrxkotlin.quotes.repository.impl.QuoteFetchRepoImpl
import com.example.root.mvvmkoinrxkotlin.quotes.repository.repo.QuoteFetchRepo
import com.example.root.mvvmkoinrxkotlin.quotes.usecase.cases.QuoteGetUseCase
import com.example.root.mvvmkoinrxkotlin.quotes.usecase.impl.QuoteGetCaseImpl
import com.example.root.mvvmkoinrxkotlin.quotes.viewmodel.QuotesViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

/**
 * Created by Akash Saggu(R4X) on 7/9/18 at 11:26.
 * akashsaggu@protonmail.com
 * @Version 1 (7/9/18)
 * @Updated on 7/9/18
 */

val viewModel = module {
    viewModel { QuotesViewModel(get()) }
    single { QuoteFetchRepoImpl() as QuoteFetchRepo }
    single { QuoteGetCaseImpl(get()) as QuoteGetUseCase }
}