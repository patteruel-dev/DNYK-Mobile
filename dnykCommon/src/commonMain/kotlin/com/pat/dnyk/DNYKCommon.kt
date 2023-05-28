package com.pat.dnyk

import com.pat.dnyk.dependencies.DependencyManager
import com.pat.dnyk.services.AuthService
import org.koin.core.KoinApplication
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class DNYKCommon : KoinComponent {
    private var koinApplication: KoinApplication? = null

    val authService: AuthService by inject()

    fun setup() {
        koinApplication = DependencyManager.setupKoin()
    }
}
