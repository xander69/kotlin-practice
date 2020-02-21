package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val person = Person("XXX")
    val driver = Driver("YYY")

    println(person)
    println(person.age)
    println(person.getAddress())

    println(driver)
    println(driver.age)
    println(driver.getAddress())
}