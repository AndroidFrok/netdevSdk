package com.sdk;

public class MutableInteger {
    public int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addValue(int value) {
        this.value = this.value + value;
    }

    public MutableInteger() {
    }

    public MutableInteger(int values) {
        value = values;
    }
}
