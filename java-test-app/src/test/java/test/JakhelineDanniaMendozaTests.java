package test;

import org.example.models.JakhelineDanniaMendoza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JakhelineDanniaMendozaTests {
    private JakhelineDanniaMendoza calculator;

    @BeforeEach
    public void setUp() {
        calculator = new JakhelineDanniaMendoza();
    }

    @Test
    public void testSum() {
        // Arrange
        double a = 10.5;
        double b = 20.3;
        double expectedSum = 30.8;

        // Act
        double actualSum = calculator.Sum(a, b);

        // Assert
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testDivide() {
        // Arrange
        double dividend = 100;
        double divisor = 5;
        double expectedDivision = 20;

        // Act
        double actualDivision = calculator.Divide(dividend, divisor);

        // Assert
        assertEquals(expectedDivision, actualDivision);
    }

    @Test
    public void testDivideByZero() {
        // Arrange
        double dividend = 50;
        double divisor = 0;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.Divide(dividend, divisor);
        });
    }
}
