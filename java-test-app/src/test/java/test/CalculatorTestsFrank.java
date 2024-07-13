package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.models.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 10;
        int expectedSum = 15;

        // Act
        int actualSum = calculator.add(a, b);

        // Assert
        assertEquals(expectedSum, actualSum);
    }
}
