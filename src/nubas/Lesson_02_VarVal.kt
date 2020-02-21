package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val userJava = UserJava("some@mail.com")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("kotlin@java.com")
    println("Kotlin example: ${userKotlin.email}")
}