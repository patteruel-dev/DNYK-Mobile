package com.pat.dnyk.dependencies.services

import com.pat.dnyk.services.AuthService
import org.koin.dsl.module

object ServiceModules {
    fun get() = module {
        single<AuthService> { AuthService(get()) }
    }
}