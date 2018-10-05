package tech.bts.classes.Java;

public class Calculator {

    //Fields
    private double value;
    private int operationCount;

    //Constructor
    public Calculator(double value) {
        this.value = value;
        this.operationCount = 0;
    }

    //Methods
    public void add(double x) {
        this.value += x;
        this.operationCount ++;
    }

    public void divideBy(double x) {
        this.value /= x;
        this.operationCount ++;
    }

    /**Resets the value and the operationCount to 0*/
    public void clear() {
        this.value = 0;
        this.operationCount = 0;
    }

    public double getValue() {
        return value;
    }

    public int getOperationCount() {
        return this.operationCount;
    }
}
