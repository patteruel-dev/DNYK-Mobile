package com.pat.dnyk.dependencies

import com.pat.dnyk.dependencies.services.ServiceModules
import com.pat.dnyk.dependencies.usecases.mock.UseCaseMockModules
import org.koin.core.context.startKoin

internal object DependencyManager {
    fun setupKoin() = startKoin {
        modules(
            PlatformModules.get(),
            UseCaseMockModules.get(),
            ServiceModules.get()
        )
    }
}
