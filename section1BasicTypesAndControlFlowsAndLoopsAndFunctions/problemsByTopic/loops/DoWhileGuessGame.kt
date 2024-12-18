/*
Problem: Make a guessing game.
Description: You will make a simple game that asks the user to guess a number.
The computer will randomly choose a number between 1 and 100.
The user must enter a guess repeatedly until the number is correctly guessed.
Use a "do-while" loop to repeat the game each time the user enters a guess until the guess is correct.
The program should print "Too high" if the guess is too high,
"Too low" if the guess is too low, and
"You got it!" if the guess is correct.
 */
package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.problemsByTopic.loops

import kotlin.random.Random

fun main() {
    val numberToGuess = Random.nextInt(1, 101)
    var userGuess: Int
    do {
        print("Enter your guess: ")
        userGuess = readln().toInt()
        when {
            userGuess > numberToGuess -> println("Too high")
            userGuess < numberToGuess -> println("Too low")
            else -> println("You got it!")
        }
    } while (userGuess != numberToGuess)
}
