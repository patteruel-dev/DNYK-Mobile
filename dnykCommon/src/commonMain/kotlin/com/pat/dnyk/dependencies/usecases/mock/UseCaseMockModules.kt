package com.pat.dnyk.dependencies.usecases.mock

import com.pat.dnyk.usecases.authorize.AuthorizeDataSource
import com.pat.dnyk.usecases.authorize.AuthorizeUseCase
import com.pat.dnyk.usecases.implementations.mock.AuthorizeMockDataSource
import com.pat.dnyk.usecases.implementations.mock.AuthorizeMockUseCase
import org.koin.core.module.Module

internal object UseCaseMockModules {
    fun get(): Module {
        return org.koin.dsl.module {
            single<AuthorizeDataSource> { AuthorizeMockDataSource(get()) }
            single<AuthorizeUseCase> { AuthorizeMockUseCase(get()) }
        }
    }
}
