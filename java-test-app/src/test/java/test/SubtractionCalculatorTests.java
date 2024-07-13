package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.example.models.SubtractionCalculator;
import org.example.models.DifferenceCalculator;

public class SubtractionCalculatorTests {
    private SubtractionCalculator subtractionCalculator;
    private DifferenceCalculator differenceCalculator;

    @BeforeEach
    public void setUp() {
        subtractionCalculator = new SubtractionCalculator();
        differenceCalculator = new DifferenceCalculator();
    }

    @Test
    public void testSubtractionCalculator() {
        // Arrange
        int number1 = 10;
        int number2 = 6;
        int expectedSubtractionResult = 4; // 10 - 6 = 4

        // Act
        int actualSubtractionResult = subtractionCalculator.calculateSubtraction(number1, number2);

        // Assert
        assertEquals(expectedSubtractionResult, actualSubtractionResult);
    }

    @Test
    public void testDifferenceCalculator() {
        // Arrange
        int number1 = 10;
        int number2 = 6;
        int expectedDifferenceResult = 4; // 10 - 6 = 4

        // Act
        int actualDifferenceResult = differenceCalculator.calculateDifference(number1, number2);

        // Assert
        assertEquals(expectedDifferenceResult, actualDifferenceResult);
    }
}
