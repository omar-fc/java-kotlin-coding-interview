package com.hadsol.game

enum class Choice {
    ROCK, PAPER, SCISSORS;

    fun beats(other: Choice): Boolean = when (this) {
        ROCK -> other == SCISSORS
        PAPER -> other == ROCK
        SCISSORS -> other == PAPER
    }
}

enum class Result {
    WIN, LOSE, DRAW
}
