package tech.bts.classes;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator(0);

        calc.add(3);
        calc.add(7);
        calc.add(5);
        calc.divideBy(3);
        System.out.println(calc.getValue());
        System.out.println("Operations: " + calc.getOperationCount());
    }
}
