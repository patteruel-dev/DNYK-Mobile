package com.pat.dnyk.services

import com.pat.dnyk.Constants
import com.russhwolf.settings.Settings
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AuthService() : KoinComponent {
    private val settings: Settings by inject()

    @Throws(Throwable::class)
    suspend fun authorize() {
        settings.putBoolean(Constants.AUTHORIZED, true)
    }

    @Throws(Throwable::class)
    suspend fun isAuthorized(): Boolean {
        return settings.getBoolean(Constants.AUTHORIZED, false)
    }
}
