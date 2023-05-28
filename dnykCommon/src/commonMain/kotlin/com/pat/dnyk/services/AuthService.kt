package com.pat.dnyk.services

import com.pat.dnyk.usecases.authorize.AuthorizeUseCase

class AuthService internal constructor(
    private val authorizeUseCase: AuthorizeUseCase
) {
    @Throws(Throwable::class)
    suspend fun authorize() = authorizeUseCase.execute(Unit)

    @Throws(Throwable::class)
    suspend fun isAuthorized(): Boolean {
        return false
//        return settings.getBoolean(Constants.AUTHORIZED, false)
    }

    @Throws(Throwable::class)
    suspend fun logout() {
//        settings.putBoolean(Constants.AUTHORIZED, false)
        TODO()
    }
}
