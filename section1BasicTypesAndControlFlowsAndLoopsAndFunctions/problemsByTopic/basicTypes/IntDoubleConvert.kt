package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.problemsByTopic.basicTypes

fun main(){
    println("Which type of conversion do you want to do?" +
            "\n1. Int to Double" + "\n2. Double to Int" + "Enter 1 or 2")
    val convertType = readln()
    if (convertType !in listOf("1", "2")) {
        println("Invalid choice")
        return
    }
    else {
        when (convertType) {
            "1" -> {
                println("Enter an integer")
                val int = readln().toInt()
                val double = int.toDouble()
                println("The double value is $double")
            }

            "2" -> {
                println("Enter a double")
                val double = readln().toDouble()
                val int = double.toInt()
                println("The integer value is $int")
            }
        }
    }
}
