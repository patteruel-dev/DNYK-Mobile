package com.pat.dnyk.dependencies

import org.koin.core.module.Module

// implement for iOS
expect object PlatformModules {
    fun get(): Module
}
