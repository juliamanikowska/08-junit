package put.io.testing.junit;

import org.junit.jupiter.api.Test;
import put.io.testing.audiobooks.Audiobook;
import put.io.testing.audiobooks.AudiobookPriceCalculator;
import put.io.testing.audiobooks.Customer;

import static org.junit.jupiter.api.Assertions.*;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.GOLD;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.SILVER;
import static put.io.testing.audiobooks.Customer.LoyaltyLevel.STANDARD;

class AudiobookPriceCalculatorTest {
    @Test
    void test_calculate1() {
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        Customer c = new Customer("c", SILVER, false);
        Audiobook a = new Audiobook("ab", 1);
        assertEquals(0.9,calculator.calculate(c,a));

    }
    void test_calculate2() {
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        Customer b = new Customer("b", GOLD, false);
        Audiobook a = new Audiobook("ab", 1);
        assertEquals(0.8,calculator.calculate(b,a));
    }
    void test_calculate3() {
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        Customer c = new Customer("c", STANDARD, false);
        Audiobook a = new Audiobook("ab", 1);
        assertEquals(1,calculator.calculate(c,a));
    }
    void test_calculate4() {
        AudiobookPriceCalculator calculator = new AudiobookPriceCalculator();
        Customer c = new Customer("c", SILVER, true);
        Audiobook a = new Audiobook("ab", 1);
        assertEquals(0.0,calculator.calculate(c,a));
    }
}

