/*
 * Sum of Even Numbers
 * Write a function part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.sumOfEvenNumbers
 * that takes an integer n and returns the sum of all even numbers from 1 to n.
 * Hints:
 * Use a loop to iterate through numbers from 1 to n.
 * Use conditional statements to check if a number is even.
 * Use an accumulator variable to keep the sum of even numbers.
 */

package part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.sumOfEvenNumbers

fun main() {
    println("Please enter a number to calculate the sum of all even numbers up to it:")
    val input = readln().toInt()
    println("The sum of all even numbers up to $input is ${sumOfPositiveEvenNumbers(input)}.")
}

fun sumOfPositiveEvenNumbers(n: Int): Int {
    if(n>=0) {
        var sum = 0
        for (i in 0..n) {
            if (i % 2 == 0) {
                sum += i
            }
        }
        return sum
    }
    else{
        println("Please enter a positive number.")
        return -1
    }
}