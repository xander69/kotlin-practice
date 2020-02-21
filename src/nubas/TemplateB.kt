package nubas

/**
 * @author Alexander Shakhov
 */
class TemplateB : TemplateA() {
    override fun print(){
        println("${javaClass.name} count: $count (B overriden)")
    }
}