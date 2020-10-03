/*
    Modify the previous program such that only multiples of three or five
    are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17.
 */

// Link: https://adriann.github.io/programming_problems.html

fun main() {
    val input: String
    val number: Int
    var sum = 0

    print("Enter a number: ")
    input = readLine().toString()

    number = input.toInt()

    for(index in 1..number) {
        if(index % 3 == 0 || index % 5 == 0) {
            sum += index
        }
    }

    print("Sum of the multiples of three and five: $sum")
}