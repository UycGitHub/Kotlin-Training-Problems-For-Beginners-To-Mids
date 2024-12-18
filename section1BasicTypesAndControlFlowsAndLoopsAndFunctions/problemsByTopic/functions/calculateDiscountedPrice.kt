/*
    Basic function definition and calling:
    Write a function called calculateDiscountedPrice that takes two Double parameters called price and
    discount and returns a Double.
    The function should return the discounted price of the item.
    The discounted price is calculated by subtracting the discount percentage from the price.
    For example, if the price is 100.0 and the discount is 0.1, the discounted price would be 90.0.
    The function should return the discounted price.
 */
package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.problemsByTopic.functions

fun main() {
    val priceInput = readln().toDouble()
    val discountInput = readln().toDouble()
    println(calculateDiscountedPrice(priceInput, discountInput))
}

fun calculateDiscountedPrice(price: Double, discount: Double): Double {
    return price - (price * discount)
}