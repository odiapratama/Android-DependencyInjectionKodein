package com.problemsolver.depedencyinjectionwithmvvm

import android.app.Application
import com.problemsolver.depedencyinjectionwithmvvm.data.db.Database
import com.problemsolver.depedencyinjectionwithmvvm.data.db.DatabaseFakeImpl
import com.problemsolver.depedencyinjectionwithmvvm.data.db.QuoteDao
import com.problemsolver.depedencyinjectionwithmvvm.data.repository.QuoteRepository
import com.problemsolver.depedencyinjectionwithmvvm.data.repository.QuoteRepositoryImpl
import com.problemsolver.depedencyinjectionwithmvvm.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication: Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton {QuoteRepositoryImpl(instance())}
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}