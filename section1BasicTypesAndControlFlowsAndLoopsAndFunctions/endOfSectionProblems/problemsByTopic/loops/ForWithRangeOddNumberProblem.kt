/*
    * Print all odd numbers between 1 and the user's input.
    * Problem: Find all the odd numbers in a given range.
    * Description: Find and print all the odd numbers between two given numbers.
    * For example, the odd numbers between 1 and 10 are 1, 3, 5, 7, and 9.
    * You will do this using a "for" loop and a "range".
 */
package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.problemsByTopic.loops

fun main() {
    println("Odd numbers between 1 and your input:")
    val input = readln().toInt()
    for (i in 1..input) {
        if (i % 2 != 0) {
            println(i)
        }
    }
}