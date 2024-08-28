package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.endOfSectionProblems.problemsByTopic.controlFlows

fun main() {
    println("Enter your grade")
    val grade = readln().toInt()
    println("Your grade and result is ${letterGrade(grade)}")
}

fun letterGrade(grade: Int): String {
    return when {
        grade >= 90 -> "A, Excellent"
        grade >= 80 -> "B,  Good"
        grade >= 70 -> "C, Average"
        grade >= 60 -> "D,  Passing"
        else -> "F, Fail"
    }
}

