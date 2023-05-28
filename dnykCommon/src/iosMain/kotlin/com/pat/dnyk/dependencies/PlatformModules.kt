package com.pat.dnyk.dependencies

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import org.koin.core.module.Module
import org.koin.dsl.module
import platform.Foundation.NSUserDefaults

// implement for iOS
actual object PlatformModules {
    private fun createSettings(): Settings = NSUserDefaultsSettings(NSUserDefaults("com.pat.dnyk"))
    actual fun get(): Module = module {
        single { createSettings() }
    }
}
