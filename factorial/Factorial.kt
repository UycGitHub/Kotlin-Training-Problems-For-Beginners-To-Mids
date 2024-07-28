package factorial

fun main(){
    println("Enter a number to find its factorial")
    val n = readln().toInt()
    val factorial = factorial(n)
    if(factorial != -1) println("Factorial of $n is $factorial")
//if factorial is -1, it means the number is negative, so we don't print the factorial

}

fun factorial(n: Int): Int{
    var sum = 1 //because 0! = 1 and negative numbers don't have a factorial
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