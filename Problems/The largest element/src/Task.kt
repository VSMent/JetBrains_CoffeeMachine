import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = 0
    while (scanner.hasNextInt()) {
        max = maxOf(max, scanner.nextInt())
    }
    print(max)
}