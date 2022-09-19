package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.Arithmetic;

import static org.junit.jupiter.api.Assertions.*;

public class SmallestLargestTest {

    private SmallestLargest smallestLargest;

    @BeforeEach
    void startAllTestWith() {
         smallestLargest = new SmallestLargest();
    }

    @Test
    void thatObjectExist() {
        assertNotNull(smallestLargest);
    }

    @Test
    void sumOfThreeIntegers() {
        assertEquals(30, smallestLargest.sum(15,10,5));
    }

    @Test
    void averageOfThreeIntegers() {
        assertEquals(10, smallestLargest.average(15,10,5));
    }

    @Test
    void productOfThreeIntegers() {
        assertEquals(27, smallestLargest.product(3,3,3));
    }

    @Test
    void smallestOfThreeIntegers() {
        assertEquals(81, smallestLargest.smallestInteger(151,311,81));
    }

    @Test
    void largestOfThreeIntegers() {
        assertEquals(801, smallestLargest.largestInteger(151,311,801));
    }

}
