package user.goudurixx.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform