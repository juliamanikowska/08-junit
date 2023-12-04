package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }
    @Test
    void test_add() {
        //Calculator calculator = new Calculator();
        assertEquals(3,calculator.add(1,2));
        assertEquals(8,calculator.add(3,5));
    }

    @Test
    void test_multiply() {
        //Calculator calculator = new Calculator();
        assertEquals(2,calculator.multiply(1,2));
        assertEquals(15,calculator.multiply(3,5));
    }
    @Test
    void test_addPositiveNumbers() {
        //Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(-1, 2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(1, -2);
        });
    }
}
