package nubas

/**
 * @author Alexander Shakhov
 */
abstract class TemplateBase {

    protected var count = 0

    fun a() {
        count++
        print()
    }

    abstract fun minus()

    protected open fun print() {
        println("${javaClass.name} count: $count")
    }
}