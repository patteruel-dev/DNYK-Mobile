package com.pat.dnyk.dependencies

import com.russhwolf.settings.Settings

// implement for iOS
expect object PlatformModule {
    fun createSettings(): Settings
}
