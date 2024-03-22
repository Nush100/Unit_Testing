package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualsFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void fivePlusTwoEqualsSeven(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(7,calculator.add(5,2));
    }

    @Test
    void fiveMinusTwoEqualsThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3,calculator.subtract(5,2));
    }

    @Test
    void TenMinusTwoEqualsEight(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(8,calculator.subtract(10,2));
    }

    @Test
    void sixMultiplyTwoEqualsSeven(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(12,calculator.multiply(6,2));
    }

    @Test
    void NineMultiplyThreeEqualsTwentySeven(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(27,calculator.multiply(9,3));
    }

    @Test
    void sixDivideTwoEqualsThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3,calculator.divide(6,2));
    }

    @Test
    void TenDivideThreeEqualsThree(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3,calculator.divide(10,3));
    }
}