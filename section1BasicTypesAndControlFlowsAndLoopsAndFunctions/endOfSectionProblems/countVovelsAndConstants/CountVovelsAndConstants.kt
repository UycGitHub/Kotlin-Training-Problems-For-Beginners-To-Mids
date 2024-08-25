/*
Problem 7: Count Vowels and Consonants
Write a function countVowelsAndConsonants that takes a string and returns a pair of integers,
representing the number of vowels and consonants in the string.

Hints:
Use loops and conditional statements to iterate through the string and count vowels and consonants.
Ignore case by converting the string to a common case (e.g., lowercase).
Consider vowels to be 'a', 'e', 'i', 'o', 'u' and consonants to be any alphabetical character that is not a vowel.
 */

package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.countVovelsAndConstants

import java.util.*

fun main() {
    println("Enter a word for counting vowels and consonants:")
    val input = readLine()!!.lowercase(Locale.getDefault())

    val (vowels, constants) = countVovelsAndConstants(input)
    println("Vowels: $vowels")
    println("Consonants: $constants")
}

fun countVovelsAndConstants(input: String): Pair<Int, Int> {
    val vowels = "aeiou"
    var vovelsCount = 0
    var constantsCount = 0
    for (char in input) {
        if (char in vowels) {
            vovelsCount++
        } else if (char.isLetter()) {
            constantsCount++
        }
    }
    return Pair(vovelsCount, constantsCount)
}