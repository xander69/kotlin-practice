package nubas

/**
 * @author Alexander Shakhov
 */
class Car(var mark: String, private var year: Int) {
    val isNew: Boolean
        get() {
            return year >= 2020
        }
}