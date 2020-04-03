import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val days = scanner.nextInt()
    val food = scanner.nextInt()
    val flight = scanner.nextInt()
    val night = scanner.nextInt()
    println(days * food + flight * 2 + night * (days - 1))
}