package com.byt.models;

public class AgeRange {
    private Integer min;
    private Integer max;

    public AgeRange(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "AgeRange{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
