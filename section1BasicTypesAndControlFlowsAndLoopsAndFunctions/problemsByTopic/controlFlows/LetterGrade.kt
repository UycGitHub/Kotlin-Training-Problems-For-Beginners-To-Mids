package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.problemsByTopic.controlFlows

fun main() {
    println("Enter your grade")
    val grade = readln().toInt()
    val result = if(grade<=100){
        when {
            grade >= 90 -> "A, Excellent"
            grade >= 80 -> "B,  Good"
            grade >= 70 -> "C, Average"
            grade >= 60 -> "D,  Passing"
            else -> "F, Fail"
        }
    } else {
        "Please enter a valid grade"
    }
    println("Your grade and result is $result")
}
