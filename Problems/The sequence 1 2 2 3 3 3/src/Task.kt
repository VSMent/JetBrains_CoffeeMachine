import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()
    var c = 1
    while (true) {
        repeat(c) {
            print("$c ")
            n--
            if (n == 0) return
        }
        c++
    }
}