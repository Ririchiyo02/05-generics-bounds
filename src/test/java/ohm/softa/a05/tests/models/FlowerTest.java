package ohm.softa.a05.tests.models;
import ohm.softa.a05.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlowerTest {
    @Test
    void testGreen(){
        assertThrows(IllegalArgumentException.class, () -> new Flower(1.0, "Rose", "Blue Rose", PlantColor.GREEN));
    }
}
