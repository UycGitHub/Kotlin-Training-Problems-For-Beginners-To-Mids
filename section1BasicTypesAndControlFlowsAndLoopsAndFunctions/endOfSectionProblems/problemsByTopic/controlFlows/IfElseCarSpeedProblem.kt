package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.problemsByTopic.controlFlows

fun main() {
    println("Please enter the speed of the car")
    val speed = readln().toInt()
    if(speed < 0) {
        println("Please enter a valid speed")
    }else if(speed <=59) {
        println("No ticket")
    } else if(speed in 60..79) {
        println("Small ticket")
    } else {
        println("Big ticket")
    }
}
