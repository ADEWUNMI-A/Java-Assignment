package Chapter2;

import Chapter2.ComparingInt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparingIntTest {
    ComparingInt comparingInt;

        @BeforeEach
        void startAllTestWith() {
             comparingInt = new ComparingInt();
        }

        @Test
        void thatObjectExist() {
            assertNotNull(comparingInt);
        }

        @Test
    void numberIsGreaterThan100() {
            assertTrue(comparingInt.greaterThan100(150));

        }

        @Test
    void numberIsLessThan100() {
            assertTrue(comparingInt.greaterLess100(50));
        }

        @Test
    void numberIsEqualTo100() {
            assertTrue(comparingInt.greaterEqualsTo100(100));
        }

    }
