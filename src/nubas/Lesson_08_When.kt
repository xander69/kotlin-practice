package nubas

import nubas.Color.*

/**
 * @author Alexander Shakhov
 */
fun main() {

    val n = 1
    val result = when (n) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        6 -> "Six"
        else -> "None"
    }

    println(result)

    val colorResult = getRusColor(setOf(GREEN, RED))

    println(colorResult)

    val a = 2
    val b = 4

    when {
        (a > b) -> println("$a > $b = true")
        (a < b) -> println("$a < $b = true")
        (a == b) -> println("$a == $b = true")
        else -> println("else")
    }
}

fun getRusColor(colors: Set<Color>) = when (colors) {
    setOf(GREEN, RED) -> "Красно-зеленый"
    setOf(BLACK, WHITE) -> "Черно-белый"
    else -> "Без цвета"
}
