package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val v1: TemplateBase = TemplateA()
    val v2: TemplateBase = TemplateB()

    v1.a()
    v1.a()
    v2.a()
    v2.a()
    v1.a()

    v1.minus()
    v1.minus()
    v1.minus()
    v1.minus()

    v1.a()
}