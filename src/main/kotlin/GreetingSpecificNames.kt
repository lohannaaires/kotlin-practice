// Modify the previous program such that only the users Alice and Bob are greeted with their names.

// Link: https://adriann.github.io/programming_problems.html

fun main() {

    print("Enter your name: ")
    val name = readLine().toString()

    if(name == "Alice" || name == "Bob") {
        print("Welcome, $name!")
    } else {
        print("Welcome!")
    }
}