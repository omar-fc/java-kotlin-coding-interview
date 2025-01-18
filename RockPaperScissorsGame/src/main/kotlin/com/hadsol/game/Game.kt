package com.hadsol.game

class Game(private val playerA: Player, private val playerB: Player) {
    fun playRound(): Result {
        val choiceA = playerA.choose()
        val choiceB = playerB.choose()

        return when {
            choiceA == choiceB -> Result.DRAW
            choiceA.beats(choiceB) -> Result.WIN
            else -> Result.LOSE
        }
    }
}
