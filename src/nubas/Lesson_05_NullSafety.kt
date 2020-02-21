package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val str: String = getStr()
    println("$str = ${str.length}")

    val str2: String? = getStrNull()
    val size = str2?.length
    println(size)
}

fun getStr() = "Hello"

fun getStrNull(): String? {
    return null
}