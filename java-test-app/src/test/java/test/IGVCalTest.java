package test;
import org.example.models02.IGVCal;
import static org.junit.jupiter.api.Assertions.*;

import org.example.models02.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IGVCalTest {
    private IGVCal igvCal;

    @BeforeEach
    public void setUp() {
        igvCal = new IGVCal();
    }

    @Test
    public void testIGVCal() {
        // Arrange
        var expectedIGVResultCart = 106.2;
        var product = new Product();
        product.Name = "book";
        product.Price = 15;
        var quantity = 6;

        // Act
        var actualIGVResultCart = igvCal.CalIGV(product, quantity);

        // Assert
        assertEquals(expectedIGVResultCart, actualIGVResultCart);
    }
}
