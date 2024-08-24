/*
    Problem: FibonacciSequence
    We will write it recursively.
    However, problems solved with recursion where large numbers are used as input
    may cause the program to crash or performance losses due to the windows opened in memory due
    to the function being called too many times.
    For this reason, we will not use a recursive function in our next example,
    the part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial calculation program. We will solve it with a different solution method.
 */
package part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.fibonacciSequnce

fun main(){
    val input = readln().toInt()
    println(fibonacci(input))
}

fun  fibonacci(n: Int): Int {
    if(n<0) {
        println("Incorrect input")
        return -1
    }
    else {
        if (n <= 1) return n
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
}
