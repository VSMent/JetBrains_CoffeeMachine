import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var result = 0

    repeat(n) {
        val number = scanner.nextInt()
        result = if (number % 4 == 0) maxOf(result, number) else result
    }

    println(result)
}