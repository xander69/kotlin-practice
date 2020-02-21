package nubas

/**
 * @author Alexander Shakhov
 */
class MyInterfaceImplB : MyInterface {
    override fun a() {
        println("A from Implementation B")
    }

    override fun b() {
//        super.b()
        println("B from Implementation B")
    }
}