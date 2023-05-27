package com.pat.dnyk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform