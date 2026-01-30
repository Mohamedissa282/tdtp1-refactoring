public class Conducteur {
    private String name;
    private int years;

    public Conducteur(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public boolean estAdulte() {
        return years >= 18;
    }

    public void demarrerVoiture(Voiture voiture) {
        if (estAdulte()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture(Voiture voiture) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changerVitesse(Voiture voiture, int nouvelleVitesse) {
        System.out.println(name + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle;
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
