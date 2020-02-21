package nubas

/**
 * @author Alexander Shakhov
 */
class Driver(name: String) : Person(name) {
    override val age: Int = 2

    override fun getAddress(): String {
        return "Test2"
    }
}