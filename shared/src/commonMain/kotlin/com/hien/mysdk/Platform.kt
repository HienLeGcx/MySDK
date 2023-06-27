package com.hien.mysdk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
