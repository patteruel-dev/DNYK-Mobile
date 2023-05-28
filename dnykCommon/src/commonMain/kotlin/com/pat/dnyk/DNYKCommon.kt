package com.pat.dnyk

import com.pat.dnyk.dependencies.PlatformModule
import com.pat.dnyk.services.AuthService
import org.koin.core.KoinApplication
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class DNYKCommon : KoinComponent {
    private var koinApplication: KoinApplication? = null

    val authService: AuthService by inject()

    fun setup() {
        koinApplication = startKoin {
            modules(
                module {
                    single { PlatformModule.createSettings() }
                    single { AuthService() }
                }
            )
        }
    }
}
