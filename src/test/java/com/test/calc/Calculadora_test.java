package com.test.calc;

import com.example.calc.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Calculadora_test {

    Calculadora calculadora;

    @BeforeEach()
    public void starting(){
        calculadora = new Calculadora();
    }

    @Test
    public void testedSoma(){
        Integer result = calculadora.sum(10,10);
        Integer expect_result = 20;
        assertEquals(expect_result, result);
    }

    @Test
    public void testsSubtract(){
        Integer result = calculadora.subtract(30, 15);
        Integer expected_result = 15;
        assertEquals(expected_result,result);
    }

    @Test
    public void testsMultiplicity(){
        Integer result = calculadora.multiply(7, 7);
        Integer expected_result = 49;
        assertEquals(expected_result,result);
    }

    @Test
    public void testsDivisor(){
        Integer result = calculadora.divide(9, 3);
        Integer expected_result = 3;
        assertEquals(expected_result,result);
    }

    @Test
    public void testDivisorZero() throws IllegalArgumentException{
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.divide(9,0);
        });
        String expected_result = "Can't divide by zero!";
        assertEquals(expected_result,exception.getMessage());
    }


}
