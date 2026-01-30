import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testStartCar() {
        Car voiture = new Car("Sedan", "Bleu");
        driver.startCar(voiture);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Car voiture = new Car("Sedan", "Bleu");
        driver.stopCar(voiture);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Car voiture = new Car("Sedan", "Bleu");

        driver.changeSpeed(voiture, 80);
        assertThat(voiture.getSpeed()).isEqualTo(80);
    }
}
