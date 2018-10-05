package tech.bts.javaReview.simpleProgram

import tech.bts.classes.MathUtilKotlin

fun main(args: Array<String>) {

    println("Hello, world!")

    //Declare variables
    var age : Int
    var name : String

    //Assign a value
    age = 15;

    //Declare and assign
    var weight = 40.5 //It is not necessary to specify the type (Double) because it is inferred by the value


    //if loop
    if (age >= 18) {
        println("adult")
    } else if (age >= 13) {
        println("teenager")
    } else {
        println("kid")
    }

    //for loop in range
    for (i in 1..10) {
        println(i)
    }

    //Create an empty list and add values
    //We use Mutable(...) to be able to modify the list after it is defined
    var names = mutableListOf<String>()
    names.add("potato")
    names.add("carrot")

    //Create a list with some values
    var numbers = listOf(8, 4, 6 ,5)
    //Can't do numbers.add(3)

    //Map
    var ages = mutableMapOf<String, Int>()
    ages.put("John", 30)
    ages.put("Mary", 25)
    println(ages.get("Mary"))

    //Constant values
    var price = 200.0
    var discount = 10.0
    val finalPrice = price - discount
    //val will not allow us to modify the finalPrice in the future
    //so we can't do this by mistake: finalPrice = price
    println("The final price is $finalPrice")
    println(MathUtilKotlin.power(2.0, 10))

}

