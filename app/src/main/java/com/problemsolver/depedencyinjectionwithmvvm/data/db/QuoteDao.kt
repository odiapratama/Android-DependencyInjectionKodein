package com.problemsolver.depedencyinjectionwithmvvm.data.db

import androidx.lifecycle.LiveData
import com.problemsolver.depedencyinjectionwithmvvm.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuote(): LiveData<List<Quote>>
}