package junit;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void subtraction() {
        Assertions.assertEquals(10, Calculator.subtraction(60, 50));
        Assertions.assertEquals(15, Calculator.subtraction(75, 60));
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Assertions.assertEquals(100, Calculator.multiplication(10, 10));
        Assertions.assertEquals(25, Calculator.multiplication(5, 5));
    }
}