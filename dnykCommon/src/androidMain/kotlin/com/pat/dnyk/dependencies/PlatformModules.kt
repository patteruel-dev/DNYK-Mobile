package com.pat.dnyk.dependencies

import com.russhwolf.settings.Settings
import org.koin.core.module.Module
import org.koin.dsl.module

// implement for iOS
actual object PlatformModules {
    actual fun get(): Module = module {
        single { createSettings() }
    }
    private fun createSettings(): Settings {
        TODO("Not yet implemented")
    }
}
