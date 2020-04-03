import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        if (num == 0) break
        sum += num
    }
    print(sum)
}