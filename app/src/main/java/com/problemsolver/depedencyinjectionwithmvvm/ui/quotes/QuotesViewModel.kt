package com.problemsolver.depedencyinjectionwithmvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.problemsolver.depedencyinjectionwithmvvm.data.model.Quote
import com.problemsolver.depedencyinjectionwithmvvm.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository): ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
    fun getQuote() = quoteRepository.getQuote()
}