package nubas

/**
 * @author Alexander Shakhov
 */
enum class Color(var hex: String, var opacity: Double? = 1.0) {

    RED("#FF0000"),
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    GREEN("#00FF00", 0.5);

    fun some() {
        println("my logic")
    }
}