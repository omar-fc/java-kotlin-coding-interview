package com.hadsol

import com.hadsol.game.Game
import com.hadsol.game.RandomPlayer
import com.hadsol.game.RockPlayer

fun main() {
    val game = Game(RandomPlayer(), RockPlayer())
    repeat(100) { game.playRound() }
    println(game.getStatistics())
}
