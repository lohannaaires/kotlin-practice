/*
    Write a program that asks the user for a number n and gives them the possibility
    to choose between computing the sum and computing the product of 1,…,n.
 */

// Link: https://adriann.github.io/programming_problems.html

fun main() {
    val input: String
    val number: Int
    val signal: String
    var result = 0

    print("Enter a number: ")
    input = readLine().toString()

    number = input.toInt()

    print("Enter + (sum) or * (multiplication): ")
    signal = readLine().toString()

    when (signal) {
        "+" -> {
            for (index in 1..number) {
                result += index
                println("Sum of the numbers 1 to $number: $result")
            }
        }
        "*" -> {
            result = 1
            for (index in 1..number) {
                result *= index
                println("Product of the numbers 1 to $number: $result")
            }
        }
        else -> {
            print("Invalid signal.")
        }
    }
}