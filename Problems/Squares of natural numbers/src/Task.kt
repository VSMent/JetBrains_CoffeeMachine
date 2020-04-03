import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var c = 1;
    while (c * c <= n) {
        println(c * c)
        c++
    }
}