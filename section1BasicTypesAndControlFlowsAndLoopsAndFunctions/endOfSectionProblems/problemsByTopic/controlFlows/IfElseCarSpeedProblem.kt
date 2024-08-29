package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.problemsByTopic.controlFlows

fun main() {
    println("Please enter the speed of the car")
    val speed = readln().toInt()
    if(speed < 0) {
        println("Please enter a valid speed")
    }else {
        println(trafficTicketDedector(speed))
    }
}

fun trafficTicketDedector(speed: Int): String {
    // Write a function that takes in a speed and returns a string that says "No ticket" if the speed is less than 60,
    // "Small ticket" if the speed is between 60 and 80, and "Big ticket" if the speed is greater than 80.
    if(speed <=59) {
        return "No ticket"
    } else if(speed in 60..79) {
        return "Small ticket"
    } else {
        return "Big ticket"
    }
}