// Task 13.4: Money class
data class Money(val euros: Int, val cents: Int) {
    operator fun plus(other: Money): Money {
        val totalCents = cents + other.cents
        return Money(euros + other.euros + totalCents / 100, totalCents % 100)
    }
}