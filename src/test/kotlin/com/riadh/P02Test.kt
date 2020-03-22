package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class P02Test {

    @Test
    internal fun `should find the last but one element of a list`() {
        // Given
        val list = listOf(1, 1, 2, 3, 5, 8)

        // When
        val result = P02().penultimate(list)

        // Then
        result.map {
            Assertions.assertThat(it).isEqualTo(5)
        }

    }
}
