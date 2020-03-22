package com.riadh

import arrow.core.Option.Companion.empty
import arrow.core.some

class P02 {
    fun penultimate(list: List<Int>) =
        when {
            list.isEmpty() -> empty()
            list.isContainingOneElement() -> empty()
            else -> list.subList(0, list.size - 1).last().some()
        }


    private fun <T> List<T>.isContainingOneElement() = this.size == 1

}
