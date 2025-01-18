package com.hadsol.game

import kotlin.test.Test
import kotlin.test.assertEquals

class GameStatisticsTest {

    @Test
    fun `test statistics formatting`() {
        // Given
        val stats = GameStatistics(
            firstPlayerWins = 31,
            secondPlayerWins = 37,
            draws = 32
        )
        val expected = """
            Alice wins 31 of 100 games
            Bob wins 37 of 100 games
            Draws: 32 of 100 games
        """.trimIndent()

        // Then
        assertEquals(
            expected,
            stats.format("Alice", "Bob")
        )
    }

    @Test
    fun `test statistics with zero games`() {
        val stats = GameStatistics()
        val formatted = stats.format("Player 1", "Player 2")
        val expected = """
            Player 1 wins 0 of 0 games
            Player 2 wins 0 of 0 games
            Draws: 0 of 0 games
        """.trimIndent()

        assertEquals(expected, formatted)
    }

}
