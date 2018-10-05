package tech.bts.classes;

public class Calculator {

    //Fields
    private double value;

    //Constructor
    public Calculator(double initialValue) {
        this.value = initialValue;
    }

    //Methods
    public void add(double x) {
        this.value += x;
    }

    public void divideBy(double x) {
        this.value /= x;
    }

    public double getValue() {
        return value;
    }
}
