package com.riadh

class P01 {

    fun last(list: List<Int>) = when (list.size) {
        0 -> throw NoSuchElementException("List is empty!")
        1 -> list[0]
        else -> list[list.size - 1]
    }

}
