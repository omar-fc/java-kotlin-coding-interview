package com.hadsol.game

data class GameStatistics(
    val firstPlayerWins: Int = 0,
    val secondPlayerWins: Int = 0,
    val draws: Int = 0
) {
    private val totalGames: Int get() = firstPlayerWins + secondPlayerWins + draws

    fun format(firstPlayerName: String, secondPlayerName: String): String = """
        $firstPlayerName wins $firstPlayerWins of $totalGames games
        $secondPlayerName wins $secondPlayerWins of $totalGames games
        Draws: $draws of $totalGames games
    """.trimIndent()
}
