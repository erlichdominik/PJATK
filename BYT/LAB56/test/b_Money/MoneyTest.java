package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
    Currency SEK, DKK, NOK, EUR;
    Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;

    @Before
    public void setUp() throws Exception {
        SEK = new Currency("SEK", 0.15);
        DKK = new Currency("DKK", 0.20);
        EUR = new Currency("EUR", 1.5);
        SEK100 = new Money(10000, SEK);
        EUR10 = new Money(1000, EUR);
        SEK200 = new Money(20000, SEK);
        EUR20 = new Money(2000, EUR);
        SEK0 = new Money(0, SEK);
        EUR0 = new Money(0, EUR);
        SEKn100 = new Money(-10000, SEK);
    }

    @Test
    public void testGetAmount() {
        assertEquals("SEK100", 100.00, SEK100.getAmount());
        assertEquals("EUR10", 10.00, EUR10.getAmount());
        assertEquals("SEK200", 200.00, SEK100.getAmount());
        assertEquals("EUR20", 20.00, SEK100.getAmount());
        assertEquals("SEK0", 0.00, SEK100.getAmount());
        assertEquals("EUR0", 0.00, SEK100.getAmount());
        assertEquals("SEKn100", -10.00, SEK100.getAmount());
    }

    @Test
    public void testGetCurrency() {
        assertEquals("SEK100", SEK , SEK100.getCurrency());
        assertEquals("EUR10", EUR, EUR10.getCurrency());
        assertEquals("SEK200", SEK , SEK200.getCurrency());
        assertEquals("EUR20", EUR, EUR20.getCurrency());
        assertEquals("SEK0", SEK , SEK0.getCurrency());
        assertEquals("EUR0", EUR, EUR0.getCurrency());
        assertEquals("SEKn100", SEK , SEKn100.getCurrency());
    }

    @Test
    public void testToString() {
        assertEquals("SEK100", "100.00 SEK", SEK100.toString());
        assertEquals("EUR10", "10.00 EUR", EUR10.toString());
        assertEquals("SEK200", "200.00 SEK", SEK200.toString());
        assertEquals("EUR20", "20.00 EUR", EUR20.toString());
        assertEquals("SEK0", "0.00 SEK", SEK0.toString());
        assertEquals("EUR0", "0.00 EUR", EUR0.toString());
        assertEquals("SEKn100", "-100.00 SEK", SEKn100.toString());
    }

    @Test
    public void testGlobalValue() {
        fail("Write test case here");
    }

    @Test
    public void testEqualsMoney() {
        fail("Write test case here");
    }

    @Test
    public void testAdd() {
        fail("Write test case here");
    }

    @Test
    public void testSub() {
        fail("Write test case here");
    }

    @Test
    public void testIsZero() {
        fail("Write test case here");
    }

    @Test
    public void testNegate() {
        fail("Write test case here");
    }

    @Test
    public void testCompareTo() {
        fail("Write test case here");
    }
}
