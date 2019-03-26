import handbook.examples.MyMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void add() {
        assertEquals(4, MyMath.add(2, 2));
    }

    @Test
    void sub() {
        assertEquals(10, MyMath.sub(20, 10));
    }

    @Test
    void multiply() {
        assertEquals(25, MyMath.multiply(5, 5));
    }

    @Test
    void divide() {
        assertEquals(10, MyMath.divide(10, 2));
    }
}