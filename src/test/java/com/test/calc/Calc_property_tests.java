package com.test.calc;
import com.example.calc.Calculadora;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitQuickcheck.class)
public class Calc_property_tests {
    Calculadora calculadora;

    @Property
    public void commutative(int rand1, int rand2) {
        calculadora = new Calculadora();
        int result1 = calculadora.sum(rand1, rand2);
        int result2 = calculadora.sum(rand2, rand1);
        Assert.assertEquals(result1, result2);
    }
}
