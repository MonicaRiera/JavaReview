package tech.bts.classes.Kotlin

//In Kotlin, the fields are declared in the constructor
class CalculatorKotlin(value: Double) {

    //private set makes the "setter" method private
    // so we can access the file from the Main
    // but we can't change its value
    var value: Double = value
    private set

    //We can still have additional fields
    var operationCount: Int = 0
    private set


    //Methods

    fun add(x: Double) {
        this.value += x
        this.operationCount ++
    }

    fun divideBy(x: Double) {
        this.value /= x
        this.operationCount ++
    }

    /**Resets the value and the operationCount to 0*/
    fun clear() {
        this.value = 0.0
        this. operationCount = 0
    }
}