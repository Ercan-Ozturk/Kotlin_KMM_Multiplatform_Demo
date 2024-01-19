package com.example.multiplatformdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform