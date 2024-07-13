package test;
import org.junit.jupiter.api.Test;
import org.example.models.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EivyTest {

    @Test
    public void testAnimalAttributes() {
        AnimalSoundEivy animal = new AnimalSoundEivy("Rex", "Perro", "Ladrido", "Marrón");

        assertEquals("Rex", animal.getNombre());
        assertEquals("Perro", animal.getRaza());
        assertEquals("Ladrido", animal.getSonido());
        assertEquals("Marrón", animal.getColor());
    }

    @Test
    public void testHacerSonido() {
        AnimalSoundEivy animal = new AnimalSoundEivy("Mimi", "Gato", "Maullido", "Blanco");

        assertEquals("Maullido", animal.hacerSonido());
    }
}
