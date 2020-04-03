import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n = 0
    var c = scanner.nextInt()
    while (c != 0) {
        n++
        c = scanner.nextInt()
    }
    print(n)
}