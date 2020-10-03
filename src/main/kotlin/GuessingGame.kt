/*
    Write a guessing game where the user has to guess a secret number. After every guess the program tells
    the user whether their number was too high or too low. At the end the number of tries needed should
    be printed. It counts only as one try if they input the same number multiple times consecutively.
 */

// Link: https://adriann.github.io/programming_problems.html

fun clrscr () {
    print("\n".repeat(6))
}

fun main() {
    var input: String
    var number: Int
    var win = false
    var numberOfTries = 0
    val secretNumber = (0..10).random()

    clrscr()

    do {

        print("\u001b[H\u001b[2J")

        print("Pick a number (from 0 to 10): ")
        input = readLine().toString()

        number = input.toInt()

        clrscr()

        when {
            number > secretNumber -> {
                println("You guessed too high! Try again.")
            }
            number < secretNumber -> {
                println("You guessed too low! Try again.")
            }
            else -> {
                println("Wow! Congrats! You got the right number. It was $secretNumber!")
                win = true
            }

        }

        numberOfTries++
    } while(!win)

    println("You guessed the secret number with $numberOfTries tries.")

}