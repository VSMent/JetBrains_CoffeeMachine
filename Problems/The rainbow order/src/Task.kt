import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print(Rainbow.valueOf(input.next()).ordinal + 1)
}

enum class Rainbow {
    red, orange, yellow, green, blue, indigo, violet
}