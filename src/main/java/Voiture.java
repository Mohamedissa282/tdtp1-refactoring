
public class Voiture {
    /**
     * model de la voiture
     */
    private String modele;
    /**
     * color de la voiture
     */
    private String color;
    /**
     * vitesse
     */
    private int vitesse;
    /**
     *
     */
    private static final int PAS_VITESSE = 10;
    /**
     * intialisation la vitesse maximum avec 120
     */
    private static final int VITESSE_MAX = 120;

    /**
     * constructeur
     * @param model
     * @param color
     */
    public Voiture(String model, String color) {
        this.modele = model;
        this.color = color;
        this.vitesse = 0;
    }

    /**
     * on recupere la vitesse
     * @return
     */
    public int getVitesse() {
        return this.vitesse;
    }

    /**
     * Règle la vitesse automatiquement
     * @param nouvelleVitesse
     */
    public void atteindreVitesse(int nouvelleVitesse) {
        if (nouvelleVitesse > VITESSE_MAX) {
            nouvelleVitesse = VITESSE_MAX;
        }

        if (nouvelleVitesse < 0) {
            nouvelleVitesse = 0;
        }


        while (this.vitesse < nouvelleVitesse) {
            this.accelerer();
        }


        while (this.vitesse > nouvelleVitesse) {
            this.ralentir();
        }
    }
    /**
     * fonctionne accelerer
     */
    public void accelerer() {
        if (vitesse + PAS_VITESSE <= VITESSE_MAX) {
            vitesse += PAS_VITESSE;
            // afficher détails
            afficheDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void afficheDetails() {
        System.out.println("Modèle : " + modele);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + vitesse);
    }

    /**
     * fonction relantir
     */
    public void ralentir() {
        if (vitesse - PAS_VITESSE >= 0) {
            vitesse -= PAS_VITESSE;
            // afficher détails
            afficheDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

