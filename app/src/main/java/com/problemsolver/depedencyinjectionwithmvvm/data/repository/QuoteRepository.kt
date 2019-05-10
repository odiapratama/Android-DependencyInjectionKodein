package com.problemsolver.depedencyinjectionwithmvvm.data.repository

import androidx.lifecycle.LiveData
import com.problemsolver.depedencyinjectionwithmvvm.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}