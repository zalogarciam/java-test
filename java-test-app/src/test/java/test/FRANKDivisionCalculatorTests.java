package test;

import org.example.models.Division;
import org.example.models.DivisionCalculator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FRANKDivisionCalculatorTests {
    private FRANKDivisionCalculator divisionCalculator;

    @BeforeEach
    public void setUp() {
        divisionCalculator = new FRANKDivisionCalculator();
    }

    @Test
    public void testDivisionCalculator() {
        // Arrange
        var expectedDivisionResult = 5.0;
        var division = new Division();
        division.OperationName = "Divide";
        division.Numerator = 5.0;
        division.Denominator = 1.0;

        // Act
        var actualDivisionResult = divisionCalculator.divide(division);

        // Assert
        assertEquals(expectedDivisionResult, actualDivisionResult);
    }

    @Test
    public void testDivisionByZero() {
        // Arrange
        var division = new Division();
        division.OperationName = "Divide";
        division.Numerator = 5.0;
        division.Denominator = 0.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            divisionCalculator.divide(division);
        });
    }
}