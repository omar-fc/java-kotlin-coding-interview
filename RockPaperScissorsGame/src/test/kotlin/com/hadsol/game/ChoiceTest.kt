package com.hadsol.game

import com.hadsol.game.Choice.PAPER
import com.hadsol.game.Choice.ROCK
import com.hadsol.game.Choice.SCISSORS
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class ChoiceTest {

    @Test
    fun `rock should beat scissors`() {
        assertTrue(ROCK.beats(SCISSORS))
    }

    @Test
    fun `scissors should beat paper`() {
        assertTrue(SCISSORS.beats(PAPER))
    }

    @Test
    fun `paper should beat rock`() {
        assertTrue(PAPER.beats(ROCK))
    }

}
