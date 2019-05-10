package com.problemsolver.depedencyinjectionwithmvvm.data.repository

import com.problemsolver.depedencyinjectionwithmvvm.data.db.QuoteDao
import com.problemsolver.depedencyinjectionwithmvvm.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao): QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuote() = quoteDao.getQuote()
}