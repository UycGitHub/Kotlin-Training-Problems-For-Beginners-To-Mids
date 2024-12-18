/*
Write a program that converts between Fahrenheit, Celsius, and Kelvin.
The program should take a value and a unit to convert from and a unit to convert to.
The units should be represented as strings, for example "Fahrenheit", "Celsius", or "Kelvin".
The program should convert the temperature and print the result.
 */
package section1BasicTypesAndControlFlowsAndLoopsAndFunctions.convertTemperature

fun main(){
    println("Enter the value you want to convert:")
    val value = readLine()!!.toDouble()
    println("Enter the unit you want to convert from: Fahrenheit, Celsius, Kelvin")
    val fromUnit = readLine()!!
    println("Enter the unit you want to convert to: Fahrenheit, Celsius, Kelvin")
    val toUnit = readLine()!!
    val result = convertTemperature(value, fromUnit, toUnit)
    println("$value $fromUnit is $result $toUnit")
}

fun convertTemperature(value: Double, fromUnit: String, toUnit: String): Double {
    if(fromUnit == "Celsius" && toUnit == "Fahrenheit"){
        return value * 9/5 + 32
    } else if(fromUnit == "Fahrenheit" && toUnit == "Celsius"){
        return (value - 32) * 5/9
    } else if(fromUnit == "Celsius" && toUnit == "Kelvin"){
        return value + 273.15
    } else if(fromUnit == "Kelvin" && toUnit == "Celsius"){
        return value - 273.15
    } else if(fromUnit == "Fahrenheit" && toUnit == "Kelvin"){
        return (value - 32) * 5/9 + 273.15
    } else if(fromUnit == "Kelvin" && toUnit == "Fahrenheit"){
        return (value - 273.15) * 9/5 + 32
    } else {
        return value
    }
}
