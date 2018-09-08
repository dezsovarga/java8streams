package com.dezso.varga.exercise.streams;

public class Stats {

    private int count;
    private double average;
    private int min;
    private int max;
    private int sum;

    public Stats(int count, double average, int min, int max, int sum) {
        this.count = count;
        this.average = average;
        this.min = min;
        this.max = max;
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
