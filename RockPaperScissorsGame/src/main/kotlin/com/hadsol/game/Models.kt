package com.hadsol.game

enum class Choice {
    ROCK, PAPER, SCISSORS;

    fun beats(other: Choice): Boolean = false
}
