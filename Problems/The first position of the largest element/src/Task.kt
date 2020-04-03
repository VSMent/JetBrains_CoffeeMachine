import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var max = 0
    var pos = 0
    var c = 0
    while (scanner.hasNextInt()) {
        val n = scanner.nextInt()
        c++
        if (c == 1 || max < n) {
            max = n
            pos = c
        }
    }
    print("$max $pos")
}