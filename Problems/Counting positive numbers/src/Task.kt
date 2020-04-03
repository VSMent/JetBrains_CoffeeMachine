import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var pos = 0

    repeat(n) {
        if (scanner.nextInt() > 0) {
            pos++
        }
    }

    println(pos)
}