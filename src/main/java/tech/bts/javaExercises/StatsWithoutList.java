package tech.bts.javaExercises;

public class StatsWithoutList {

    private double sum = 0;
    private int counter = 0;
    private double max = 0;
    private double min = Double.MAX_VALUE;

    public void add(double x) {
        sum += x;
        counter ++;

        if (x > max) {
            max = x;
        }

        if (x < min) {
            min = x;
        }


    }

    public double getSum() {
        return sum;
    }

    public int getCount() {
        return counter;
    }

    public double getAverage() {
        return sum/counter;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }


}
