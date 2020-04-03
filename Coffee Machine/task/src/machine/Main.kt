package machine

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val cm = CoffeeMachine()
    cm.initialMessage()
    while (cm.state != CoffeeMachine.States.Exit) {
        cm.handleCommand(scanner.next())
    }
}

class CoffeeMachine(
        var water: Int = 400,
        var milk: Int = 540,
        var beans: Int = 120,
        var cups: Int = 9,
        var money: Int = 550,
        var state: States = States.Wait
) {
    fun handleCommand(command: String) {
        when {
            command == "buy" -> {
                state = States.Buy
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
            }
            command == "fill" -> {
                state = States.Fill_Water
                print("Write how many ml of water do you want to add: ")
            }
            command == "take" -> {
                take()
                initialMessage()
            }
            command == "remaining" -> {
                remaining()
                initialMessage()
            }
            command == "exit" -> state = States.Exit

            command.toIntOrNull() != null -> {
                when (state) {
                    States.Buy -> {
                        buy(Coffees.values()[command.toInt() - 1])
                        initialMessage()
                    }
                    States.Fill_Water -> {
                        water += command.toInt()
                        state = States.Fill_Milk
                        print("Write how many ml of milk do you want to add: ")
                    }
                    States.Fill_Milk -> {
                        milk += command.toInt()
                        state = States.Fill_Beans

                        print("Write how many grams of coffee beans do you want to add: ")
                    }
                    States.Fill_Beans -> {
                        beans += command.toInt()
                        state = States.Fill_Cups
                        print("Write how many disposable cups of coffee do you want to add: ")
                    }
                    States.Fill_Cups -> {
                        cups += command.toInt()
                        state = States.Wait
                        initialMessage()
                    }
                    else -> return
                }
            }
            else -> initialMessage()
        }
    }

    fun initialMessage() {
        print("Write action (buy, fill, take, remaining, exit): ")
    }

    fun buy(coffee: Coffees) {
        fun makeIfCan(w: Int, m: Int, b: Int) {
            when {
                water < w -> println("Sorry, not enough water!")
                milk < m -> println("Sorry, not enough milk!")
                beans < b -> println("Sorry, not enough coffee beans!")
                cups < 1 -> println("Sorry, not enough cups!")
                else -> {
                    println("I have enough resources, making you a coffee!")
                    water -= w
                    milk -= m
                    beans -= b
                    cups--
                }
            }
        }

        money += when (coffee) {
            Coffees.Espresso -> {
                makeIfCan(250, 0, 16)
                4
            }
            Coffees.Latte -> {
                makeIfCan(350, 75, 20)
                7
            }
            Coffees.Cappuccino -> {
                makeIfCan(200, 100, 12)
                6
            }
        }
    }

    fun take() {
        println("I gave you \$$money")
        money = 0
    }

    fun remaining() {
        println("The coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$beans g of coffee beans")
        println("$cups disposable cups")
        println("$money $ money")
    }

    enum class States {
        Wait, Buy, Fill_Water, Fill_Milk, Fill_Beans, Fill_Cups, Exit
    }

    enum class Coffees {
        Espresso, Latte, Cappuccino
    }
}