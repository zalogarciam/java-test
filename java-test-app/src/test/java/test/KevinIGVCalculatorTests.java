package test;

import org.example.models.IGVCalculator;
import org.example.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KevinIGVCalculatorTests {
    private IGVCalculator igvCalculator;

    @BeforeEach
    public void setUp() {
        igvCalculator = new IGVCalculator();
    }

    @Test
    public void testIGVCalculatorWithDifferentValues() {
        // Arrange
        var expectedIGVResult = 59.0;
        var product = new Product();
        product.Name = "Milk";
        product.Price = 25;
        var quantity = 2;
git push
        // Act
        var actualIGVResult = igvCalculator.CaculateIGV(product, quantity);

        // Assert
        assertEquals(expectedIGVResult, actualIGVResult);
    }
}
