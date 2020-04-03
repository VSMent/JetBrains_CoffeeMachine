import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    var marks = IntArray(n) { scanner.nextInt() }

    println("${marks.count { it == 2 }} ${marks.count { it == 3 }} ${marks.count { it == 4 }} ${marks.count { it == 5 }}")
}