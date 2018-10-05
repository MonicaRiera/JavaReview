package tech.bts.classes.Kotlin

object MathUtilKotlin {

    fun power (base : Double, exponent : Int) : Double {
        var result = 1.0
        for (i in 1..exponent) {
            result *= base
        }
        return result
    }
}