package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val nums = 1..10
    println("Regular: ")
    for (value in nums) {
        print("$value ")
    }
    println()

    println("Step 2:")
    for (value in nums step 2) {
        print("$value ")
    }
    println()

    println("Reverse:")
    for (value in 10 downTo 1) {
        print("$value ")
    }
    println()

    println("Reverse step 3:")
    for (value in 10 downTo 1 step 3) {
        print("$value ")
    }
    println()
}