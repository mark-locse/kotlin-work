// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    print("Options: \na. Margherita\nb. Pepperoni\nc. Prosciutto i Funghi\nd. Quatro Fromaggi\n")
    val option = readln().lowercase()
    if (option.length == 1) 
    {
        if (option in "a".."d") {
            println("Order accepted!")
        }
        else {
            println("Invalid choice!")
        }
    }
    else {
        println("Invalid choice!")
    }
}
