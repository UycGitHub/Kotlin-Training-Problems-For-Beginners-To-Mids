/*
    Function Parameters
    Problem: You need to write a function for an application that calculates the price of a meal at a restaurant.
    The user will enter the price of the meal, the number of people there, and the total tip.
    The function will return the total price and the price per person.

    Details:
    The name of the function will be calculateTotalFoodPrice.
    It will take as input the meal price (Double), the number of people (Int), and the total tip (Int).
    The function will return two values: the total price and the price per person (both must be of type Double).
 */
package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.problemsByTopic.functions

fun main() {
    println("Please enter the price of the meal:")
    val mealPrice = readln().toDouble()
    println("Please enter the number of people:")
    val numberOfPeople = readln().toInt()
    println("Please enter the tip rate:")
    val totalTip = readln().toInt()

    println(calculateTotalFoodPrice(mealPrice, numberOfPeople, totalTip))

}

fun calculateTotalFoodPrice(mealPrice: Double, numberOfPeople: Int, totalTip: Int): String {
    val totalFoodPrice = mealPrice + totalTip
    val pricePerPerson = totalFoodPrice / numberOfPeople
    return "Total price: $totalFoodPrice, Price per person: $pricePerPerson"
}