package nubas

/**
 * @author Alexander Shakhov
 */
fun main(args: Array<String>) {
    println(myFunction())
    println(myFunction2(1234567890123456789))
    myProcedure()
    println(myFunction3(100, 200.05))
}

fun myFunction(): Int {
    return 1
}

fun myFunction2(a: Long): Int {
    return a.toInt()
}

fun myProcedure() {
    println("Print from my procedure")
}

fun myFunction3(a: Long, b: Double) = a + b
