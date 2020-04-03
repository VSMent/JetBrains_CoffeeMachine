import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var desksAmount = 0
    repeat(3) {
        val num = scanner.nextInt()
        desksAmount += num / 2 + num % 2
    }
    println(desksAmount)
}