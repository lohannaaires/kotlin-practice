// Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

// Link: https://adriann.github.io/programming_problems.html

fun main() {
    val input: String
    val number: Int
    var sum = 0

    print("Enter a number: ")
    input = readLine().toString()

    number = input.toInt()

    for(index in 1..number) {
        sum += index
    }

    print("Sum of the numbers 1 to $number: $sum")
}