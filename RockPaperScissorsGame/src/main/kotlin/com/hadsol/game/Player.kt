package com.hadsol.game

interface Player {
    fun choose(): Choice
    fun getName(): String
}

class RockPlayer(private val name: String = "Player A") : Player {
    override fun choose(): Choice = Choice.ROCK
    override fun getName(): String = name
}

class RandomPlayer(private val name: String = "Player B") : Player {
    override fun choose(): Choice = Choice.values().random()
    override fun getName(): String = name
}
