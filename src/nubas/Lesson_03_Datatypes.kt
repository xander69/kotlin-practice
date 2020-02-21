package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val a1: Boolean = false
    val a2: Byte = 123 // 8 бит
    val a3: Short = 123 // 16 бит
    val a4: Int = 123 // 32 бита
    val a5: Long = 123L // 64 бита
    val a6: Float = 1.23F // 32 бита
    val a7: Double = 123.0e-2 // 64 бита

    val b1: Long = a4.toLong()

    val c1: Char = 'c'
    val c2: String = "123"


    println("a1 = $a1")
    println("a2 = $a2")
    println("a3 = $a3")
    println("a4 = $a4")
    println("a5 = $a5")
    println("a6 = $a6")
    println("a7 = $a7")
    println("b1 = $b1")
    println("c1 = $c1")
    println("c2 = $c2")
}