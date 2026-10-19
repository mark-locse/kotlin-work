// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    print("Enter a string: ")
    val string = readln()
    val count = string.howMany {true}
    val vowels = string.howMany { character -> character.lowercaseChar() in "aeiou"}
    println("Number of characters: $count\n Number of vowels: $vowels")
}
