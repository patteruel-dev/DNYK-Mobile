package com.pat.dnyk.usecases.implementations.mock

import com.pat.dnyk.usecases.authorize.AuthorizeDataSource
import com.pat.dnyk.usecases.authorize.AuthorizeUseCase

internal class AuthorizeMockUseCase(
    override val dataSource: AuthorizeDataSource
) : AuthorizeUseCase {
    override suspend fun execute(params: Unit) {
        dataSource.authorize()
        TODO("Not yet implemented")
    }
}
