package tech.bts.classes

//In Kotlin, the fields are declared in the constructor
class CalculatorKotlin(var value: Double) {

    //We can still have additional fields
    var operationCount: Int = 0


    //Methods

    fun add(x: Double) {
        this.value += x
        this.operationCount ++
    }

    fun divideBy(x: Double) {
        this.value /= x
        this.operationCount ++
    }
}