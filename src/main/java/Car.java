
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
     * Le pas de vitesse utilisé pour accélérer ou ralentir
     */
    private static final int SPEED_STEP = 10;
    /**
     * La vitesse maximale de la voiture
     */
    private static final int MAX_SPEED = 120;
    /**
     * La vitesse minimale de la voiture
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
     * On retourne la vitesse actuelle de la voiture
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
        if (speed + SPEED_STEP <= MAX_SPEED) {
            speed += SPEED_STEP;
            // afficher détails
            displayDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * fonction pour afficher les details et on appelle juste dans fonction accelerate et slowDown
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
        if (speed - SPEED_STEP >= MIN_SPEED) {
            speed -= SPEED_STEP;
            // afficher détails
            displayDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

