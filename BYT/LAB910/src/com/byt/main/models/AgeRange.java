package com.byt.main.models;

public class AgeRange {
    private Integer min;
    private Integer max;

    public AgeRange(Integer min, Integer max) {
        //TODO: make constrains
        if(min > max) {
            throw new IllegalArgumentException("min cannot be bigger than max");
        }
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
        if(min > this.max) {
            throw new IllegalArgumentException("min cannot be bigger than max");
        }
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        if (max < this.min) {
            throw new IllegalArgumentException("min cannot be bigger than max");
        }
        this.max = max;
    }
}
