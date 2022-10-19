package com.example.calc;

public class Calculadora {

    public Integer sum(Integer val1, Integer val2){
        return val1 + val2;
    }

    public Integer subtract (Integer val1, Integer val2){
        return val1 - val2;
    }

    public Integer multiply(Integer val1, Integer val2){
        return val1 * val2;
    }

    public Integer divide(Integer val1, Integer val2){
        if (val2 == 0) {
            throw new IllegalArgumentException("Can't divide by zero!");
        }
        return val1 / val2;
    }
}
