package com.vonbelow.podsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform