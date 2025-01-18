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
    fun `rock should not beat paper or rock`() {
        assertFalse(ROCK.beats(PAPER))
        assertFalse(ROCK.beats(ROCK))
    }

    @Test
    fun `scissors should beat paper`() {
        assertTrue(SCISSORS.beats(PAPER))
    }

    @Test
    fun `scissors should not beat rock or scissors`() {
        assertFalse(SCISSORS.beats(ROCK))
        assertFalse(SCISSORS.beats(SCISSORS))
    }

    @Test
    fun `paper should beat rock`() {
        assertTrue(PAPER.beats(ROCK))
    }

    @Test
    fun `paper should not beat scissors or paper`() {
        assertFalse(PAPER.beats(SCISSORS))
        assertFalse(PAPER.beats(PAPER))
    }

}
