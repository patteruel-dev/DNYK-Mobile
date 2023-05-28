package com.pat.dnyk.usecases.implementations.mock

import com.pat.dnyk.Constants
import com.pat.dnyk.usecases.authorize.AuthorizeDataSource
import com.russhwolf.settings.Settings

internal class AuthorizeMockDataSource(
    private val settings: Settings
) : AuthorizeDataSource {
    override suspend fun authorize() {
        settings.putBoolean(Constants.AUTHORIZED, true)
    }
}
