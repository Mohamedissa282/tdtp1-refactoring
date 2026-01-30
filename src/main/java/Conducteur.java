
public class Conducteur {
    /**
     * le nom du conducteur
     */
    private String name;
    /**
     * son age
     */
    private int years;

    /**
     * constructeur
     * @param name
     * @param years
     */
    public Conducteur(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * verification de l'age
     * @return
     */
    public boolean estAdulte() {
        return years >= 18;
    }

    /**

     *Tente de démarrer la voiture si le conducteur est adulte
     *  Affiche un message de refus si le conducteur est mineur
     * @param voiture
     */
    public void demarrerVoiture(Voiture voiture) {
        if (estAdulte()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Arrête la voiture spécifiée
     * @param voiture
     */
    public void arreterVoiture(Voiture voiture) {
        System.out.println(name + " arrête la voiture.");
    }

    /**
     * Modifie la vitesse de la voiture pour atteindre une vitesse cible
     * Cette méthode gère l'accélération ou le freinage progressif
     * @param voiture
     * @param nouvelleVitesse
     */
    public void changerVitesse(Voiture voiture, int nouvelleVitesse) {
        System.out.println(name + " change la vitesse de la voiture à " + nouvelleVitesse);
        if (voiture.getVitesse() >= nouvelleVitesse) {
            while (voiture.getVitesse() > nouvelleVitesse) {
                voiture.ralentir();
            }
        } else  {
            while (voiture.getVitesse() < nouvelleVitesse) {
                voiture.accelerer();
            }
        }
    }
}
