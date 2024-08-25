package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial

fun main(){
    println("Enter a number to find its part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial")
    val n = readln().toInt()
    val factorial = factorial(n)
    if(factorial != -1) println("Factorial of $n is $factorial")
//if part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial is -1, it means the number is negative, so we don't print the part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial

}

fun factorial(n: Int): Int{
    var sum = 1 //because 0! = 1 and negative numbers don't have a part1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.factorial
    if(n == 0){
        return sum
    }
    else if (n<0){
        println("Factorial of negative numbers is not defined")
        return -1
    }
    else{
        for(i in 1..n){
            sum *= i
        }
        return sum
    }

}