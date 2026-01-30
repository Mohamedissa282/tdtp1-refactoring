import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Conducteur conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Conducteur("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conducteur.estAdulte()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        conducteur.demarrerVoiture(voiture);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Voiture voiture = new Voiture("Sedan", "Bleu");
        conducteur.arreterVoiture(voiture);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Voiture voiture = new Voiture("Sedan", "Bleu");

        conducteur.changerVitesse(voiture, 80);
        assertThat(voiture.getVitesse()).isEqualTo(80);
    }
}
