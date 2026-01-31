
public class Car {
    /**
     * model de la voiture
     */
    private String model;
    /**
     * color de la voiture
     */
    private String color;
    /**
     * vitesse
     */
    private int speed;
    /**
     *
     */
    private static final int PAS_VITESSE = 10;
    /**
     * intialisation la vitesse maximum avec 120
     */
    private static final int MAX_SPEED = 120;
    /**
     *
     */
    private static final int MIN_SPEED = 0;

    /**
     * constructeur
     * @param model
     * @param color
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    /**
     * on recupere la vitesse
     * @return
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Règle la vitesse automatiquement
     * @param newSpeed
     */
    public void reachSpeed(int newSpeed) {
        if (newSpeed > MAX_SPEED) {
            newSpeed = MAX_SPEED;
        }

        if (newSpeed < MIN_SPEED) {
            newSpeed = MIN_SPEED;
        }


        while (this.speed < newSpeed) {
            this.accelerate();
        }


        while (this.speed > newSpeed) {
            this.slowDown();
        }
    }
    /**
     * fonction accelerer
     */
    public void accelerate() {
        if (speed + PAS_VITESSE <= MAX_SPEED) {
            speed += PAS_VITESSE;
            // afficher détails
            displayDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * fonction pour afficher les details
     */
    private void displayDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    /**
     * fonction relantir
     */
    public void slowDown() {
        if (speed - PAS_VITESSE >= MIN_SPEED) {
            speed -= PAS_VITESSE;
            // afficher détails
            displayDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

