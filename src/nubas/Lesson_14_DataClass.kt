package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val human = Human("Alex", 24)
    val human2 = human.copy(age = 1)

    human.age = 12

    println(human)
    println(human2)

    val (_, age) = human
    println("My age = $age")

    human.x()
}