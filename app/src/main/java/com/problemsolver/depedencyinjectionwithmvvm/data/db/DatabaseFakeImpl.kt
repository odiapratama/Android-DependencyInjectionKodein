package com.problemsolver.depedencyinjectionwithmvvm.data.db

class DatabaseFakeImpl: Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}