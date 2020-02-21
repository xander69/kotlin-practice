package nubas

/**
 * @author Alexander Shakhov
 */
interface MyInterface {

    val prop1: Int
        get() = 2

    fun a()
    fun b() {
        println("B from Default implementation")
    }
}