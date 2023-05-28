package com.pat.dnyk.dependencies

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import platform.Foundation.NSUserDefaults

// implement for iOS
actual object PlatformModule {
    actual fun createSettings(): Settings = NSUserDefaultsSettings(NSUserDefaults("com.pat.dnyk"))
}
