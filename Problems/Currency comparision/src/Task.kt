import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    print(Countries.find(input.next()).currency == Countries.find(input.next()).currency)
}

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    Null("");

    companion object {
        fun find(name: String): Countries {
            for (country in Countries.values()) {
                if (name == country.name) return country
            }
            return Null
        }
    }
}