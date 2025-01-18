package com.hadsol.game

class Game(private val playerA: Player, private val playerB: Player) {
    private var statistics = GameStatistics()

    fun playRound(): Result {
        val choiceA = playerA.choose()
        val choiceB = playerB.choose()

        return when {
            choiceA == choiceB -> Result.DRAW
            choiceA.beats(choiceB) -> Result.WIN
            else -> Result.LOSE
        }.also { updateStatistics(it) }
    }

    private fun updateStatistics(result: Result) {
        statistics = when (result) {
            Result.WIN -> statistics.copy(firstPlayerWins = statistics.firstPlayerWins + 1)
            Result.LOSE -> statistics.copy(secondPlayerWins = statistics.secondPlayerWins + 1)
            Result.DRAW -> statistics.copy(draws = statistics.draws + 1)
        }
    }

    fun getStatistics(): String = statistics.format(firstPlayerName = playerA.getName(), secondPlayerName = playerB.getName())
}
