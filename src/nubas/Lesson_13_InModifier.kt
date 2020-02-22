package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {

    val nums = 1..10

    val value = 3
//    for (num in nums) {
//        if (num == value) {
//            println(true)
//            break
//        }
//    }
    println(value in nums)

    val characters = 'a' .. 'z'
    println(hasChar('i', characters))
    println(hasChar('щ', characters))
}

fun hasChar(char: Char, characters: CharRange) = char in characters