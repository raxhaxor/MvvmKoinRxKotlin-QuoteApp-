package com.example.root.mvvmkoinrxkotlin.quotes.view

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.root.mvvmkoinrxkotlin.R
import com.example.root.mvvmkoinrxkotlin.quotes.view.util.toast
import com.example.root.mvvmkoinrxkotlin.quotes.viewmodel.QuotesViewModel
import com.example.root.mvvmkoinrxkotlin.quotes.viewmodel.status.QuoteStatus
import org.koin.android.viewmodel.ext.android.viewModel

class QuoteActivity : AppCompatActivity() {

    private val quoteViewModel: QuotesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)
        init()
    }

    private fun init() {
        quoteViewModel.getObservableToastList().observe(this, Observer { quoteStatus ->
            when (quoteStatus) {
                is QuoteStatus.Success -> {
                    toast(quoteStatus.data)
                }
                is QuoteStatus.Error -> {
                    toast(quoteStatus.message)
                }
            }
        })
        quoteViewModel.getQuote()
    }

}
