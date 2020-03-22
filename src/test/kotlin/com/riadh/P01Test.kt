package com.riadh

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class P01Test {

    @Test
    internal fun should_last_element_of_empty_list() {
        // Given
        val list = emptyList<Int>()

        // Then
        Assertions.assertThatThrownBy { P01().last(list) }.isInstanceOf(NoSuchElementException::class.java)
            .hasMessageContaining("List is empty!")

    }

    @Test
    internal fun should_last_element_of_list_be_1() {
        // Given
        val list = listOf(1)

        // When
        val result = P01().last(list)

        // Then
        Assertions.assertThat(result).isEqualTo(1)

    }

    @Test
    internal fun should_last_element_of_list_be_8() {
        // Given
        val list = listOf(1, 1, 2, 3, 5, 8)

        // When
        val result = P01().last(list)

        // Then
        Assertions.assertThat(result).isEqualTo(8)

    }
}
