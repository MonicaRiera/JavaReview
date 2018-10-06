package tech.bts.javaExercises;

import java.util.ArrayList;
import java.util.List;

public class Stats {

    private List<Double> numbers = new ArrayList();

    public void add(double number) {
        numbers.add(number);
    }

    public double getSum() {
        double result = 0;

        for (Double number : numbers) {
            result += number;
        }

        return result;
    }

    public int getCount() {
        return numbers.size();
    }

    public double getAverage() {
        return getSum()/numbers.size();
    }

    public double getMax() {
        double max = numbers.get(0);

        for (Double number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public double getMin() {
        double min = numbers.get(0);

        for (Double number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }


}
