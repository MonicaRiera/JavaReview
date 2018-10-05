package tech.bts.classes.Kotlin

import tech.bts.classes.Java.Calculator

fun main (args: Array<String>){

    val calc = Calculator(0.0)
    val calc2 = CalculatorKotlin(0.0)

    calc.add(7.0)
    calc.add(3.0)
    calc.add(5.0)
    calc.divideBy(3.0)

    println(calc.value)

    calc2.add(7.0)
    calc2.add(3.0)
    calc2.add(5.0)
    calc2.divideBy(3.0)

    println(calc2.value)
    println("Operations: ${calc2.operationCount}")
}