package palindrom

fun main() {
    println("Please enter a string to check if it is a palindrom:")
    val input = readln()
    if(palindromCheck(input)) {
        println("The string is a palindrom.")
    } else {
        println("The string is not a palindrom.")
    }
}

fun palindromCheck(str: String): Boolean {
    for(i in 0 until str.length / 2) {
        if(str[i] != str[str.length - i - 1]) {
            return false
        }
    }
    return true
}