import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var money = scanner.nextInt()
    var insufficient = 0
    while (scanner.hasNextInt()) {
        val purch = scanner.nextInt()
        if (money - purch >= 0) {
            money -= purch
        } else {
            insufficient = purch
        }
    }
    if (insufficient == 0) {
        print("Thank you for choosing us to manage your account! You have $money money.")
    } else {
        print("Error, insufficient funds for the purchase. You have $money, but you need $insufficient.")
    }
}