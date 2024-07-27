/*
Problem: FizzBuzzPrime
Write a function fizzBuzzTwist that takes an integer n and prints the numbers from 1 to n.
For multiples of three, print "Fizz" instead of the number
and for the multiples of five, print "Buzz".
For numbers which are multiples of both three and five, print "FizzBuzz".
Additionally, if the number is a prime, print "Prime" instead of the number or any other word.
Hints:
Use a loop to iterate through numbers from 1 to n.
Use conditional statements to check for multiples of three and five.
Implement a helper function to check if a number is prime.
 */

fun main() {
    println(fizzBuzzPrime(17))
}
fun fizzBuzzPrime(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        if (isPrime(i)) {
            result.add("Prime")
        } else if (i % 3 == 0 && i % 5 == 0) {
            result.add("FizzBuzz")
        } else if (i % 3 == 0) {
            result.add("Fizz")
        } else if (i % 5 == 0) {
            result.add("Buzz")
        } else {
            result.add(i.toString())
        }
    }
    return result
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2..n / 2) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}