/*
* Palindrome Checker
* Write a function palindromChecker,
* that takes a string and returns true if the string is a palindrome, and false otherwise.
* Ignore case and non-alphanumeric characters.
*/
package part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.palindrom

fun main() {
    println("Please enter a string to check if it is a part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.palindrom:")
    val input = readln()
    if(palindromCheck(input)) {
        println("The string is a part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.palindrom.")
    } else {
        println("The string is not a part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.palindrom.")
    }
}

fun palindromCheck(str: String): Boolean {
    for(i in 0 until str.length / 2) {
        if(str[i] != str[str.length - i - 1]) {
            return false
        }
    }
    return true
}