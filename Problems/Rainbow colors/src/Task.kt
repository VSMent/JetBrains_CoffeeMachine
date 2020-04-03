import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print(input.next() in Rainbow.values().map { it.name.toLowerCase() })
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}