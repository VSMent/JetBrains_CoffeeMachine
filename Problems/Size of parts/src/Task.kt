import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var ready = 0
    var fix = 0
    var reject = 0

    repeat(n) {
        when (scanner.nextInt()) {
            -1 -> reject++
            0 -> ready++
            1 -> fix++
        }
    }

    println("$ready $fix $reject")
}