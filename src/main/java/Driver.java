
public class Driver {
    /**
     * le nom du conducteur
     */
    private String name;
    /**
     * son age
     */
    private int years;
    /**
     * L'âge minumum pour conduire
     */
    private static final int MAJORITY_AGE = 18;

    /**
     * constructeur
     * @param name
     * @param years
     */
    public Driver(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * verification de l'age
     * @return
     */
    public boolean isAdult() {
        return years >= MAJORITY_AGE;
    }

    /**

     *Tente de démarrer la voiture si le conducteur est adulte
     *  Affiche un message de refus si le conducteur est mineur
     * @param car
     */
    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Arrête la voiture
     * @param car
     */
    public void stopCar(Car car) {

        System.out.println(name + " arrête la voiture.");
        car.reachSpeed(0);
    }

    /**
     * Modifie la vitesse de la voiture pour atteindre une vitesse cible
     * Cette méthode gère l'accélération ou le freinage progressif
     * @param car
     * @param newSpeed
     */
    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        car.reachSpeed(newSpeed);
    }
}
