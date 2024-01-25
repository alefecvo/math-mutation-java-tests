import org.example.Math;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {

    Math mathTest = new Math();
    @Test
    void sum() {
        assertEquals(5, mathTest.sum(2, 3));
        assertEquals(-1, mathTest.sum(-2, 1));
        assertEquals(10, mathTest.sum(5, 5));
    }

    @Test
    void subtract() {
        assertEquals(-1, mathTest.subtract(2, 3));
        assertEquals(-3, mathTest.subtract(0, 3));
        assertEquals(5, mathTest.subtract(10, 5));
    }

    @Test
    void multiply() {
        assertEquals(6, mathTest.multiply(2, 3));
        assertEquals(0, mathTest.multiply(0, 3));
        assertEquals(-15, mathTest.multiply(3, -5));
    }

    @Test
    void divide() {
        assertEquals(2.0, mathTest.divide(6.0, 3.0), 0.0001);
        assertEquals(Double.POSITIVE_INFINITY, mathTest.divide(5.0, 0.0), 0.0001);
        assertEquals(-2.5, mathTest.divide(-10.0, 4.0), 0.0001);
    }
}