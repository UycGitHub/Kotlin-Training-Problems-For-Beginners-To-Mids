package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.problemsByTopic.loops
//while and for loop to calculate the sum of numbers in an array
fun main(){
    var numberArray = intArrayOf()
    var number = 0 //initialize number to 0
    println("Please enter the numbers in the array, if you want to stop, enter -1")
    while(true){
        print("Enter a number: ")
        number = readln().toInt()
        if (number == -1){
            break
        }
        numberArray += number
    }
    var sum = 0
    for (i in numberArray){
        sum += i
    }
    println(" Your array is ${numberArray.joinToString()}")
    println("The sum of the numbers in the array is $sum")
}