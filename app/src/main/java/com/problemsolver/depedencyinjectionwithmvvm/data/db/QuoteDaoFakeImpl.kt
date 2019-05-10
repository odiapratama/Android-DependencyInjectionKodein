package com.problemsolver.depedencyinjectionwithmvvm.data.db

import androidx.lifecycle.MutableLiveData
import com.problemsolver.depedencyinjectionwithmvvm.data.model.Quote

class QuoteDaoFakeImpl: QuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    override fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    override fun getQuote() = quotes
}