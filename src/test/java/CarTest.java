import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car voiture;

    @BeforeEach
    public void setUp() {
        voiture = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerate() {
        voiture.accelerate();
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        voiture.accelerate();
        voiture.slowDown();
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }
}
