package nubas

/**
 * @author Alexander Shakhov
 */
fun main() {
    val v1: MyInterface = MyInterfaceImplA()
    val v2: MyInterface = MyInterfaceImplB()

    v1.a()
    v1.b()

    v2.a()
    v2.b()

    println("V1-prop: ${v1.prop1}")
//    v2.prop1 = 3
//    println("V2-prop: ${v2.prop1}")
}