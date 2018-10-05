package tech.bts.classes;

public class MathUtil {


    /**Calculates the power of a given number*/
    public static double power (double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static double factorial(double n) {
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
