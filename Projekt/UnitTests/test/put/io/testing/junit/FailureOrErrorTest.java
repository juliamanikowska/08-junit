package put.io.testing.junit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FailureOrErrorTest{
    @Test
    void test1() {
        Calculator calculator = new Calculator();
        assertEquals(3,calculator.multiply(1,2));
    }
    @Test
    void test2() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(-1, 2);
        });
    }
    @Test
    void test3() {
        Calculator calculator = new Calculator();
        try {
            assertEquals(3,calculator.multiply(1,2));
        }
        catch(NumberFormatException e) {

        }

    }
}
