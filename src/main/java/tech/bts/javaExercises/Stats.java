package tech.bts.javaExercises;

import java.util.ArrayList;
import java.util.List;

public class Stats {

    private List<Double> numbers = new ArrayList();
    private double max = 0;
    private double min = Double.MAX_VALUE;

    public void add(double number) {
        numbers.add(number);
        getMaxAndMin();
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
        return max;
    }

    public double getMin() {
        return min;
    }

    public void getMaxAndMin() {
        for (Double number : numbers) {
            if (min > number) {
                min = number;
            } else if (max < number) {
                max = number;
            }
        }
    }




}
