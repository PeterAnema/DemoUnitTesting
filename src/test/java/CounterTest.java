import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    public void testCounterAddAndReset() {

        Counter counter = new Counter();
        counter.add();
        counter.add();
        counter.reset();
        counter.add(5);

        int actualValue = counter.getMemory();

        int expectedValue = 5;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCounterReset() {

        Counter counter = new Counter();
        counter.reset();

        int actualValue = counter.getMemory();

        int expectedValue = 0;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCounterSubtract() {
        Counter counter = new Counter();
        counter.subtract(10);

        int actualValue = counter.getMemory();

        int expectedValue = -10;

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testCounterAddNegative() {
        Counter counter = new Counter();

        counter.add(-1);
        counter.add(-1);

        int actual = counter.getMemory();

        int expected = -2;

        assertEquals(expected, actual);
    }

    @Test
    public void testCounterInstance() {
        Counter counter = new Counter();
        assertInstanceOf(Counter.class, counter);
    }

}