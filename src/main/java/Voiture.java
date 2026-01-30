public class Voiture {
    private String modele;
    private static String color;
    private int vitesse;
    private static final int PAS_VITESSE = 10;
    private static final int VITESSE_MAX = 120;
    public Voiture(String model, String color) {
        this.modele = model;
        this.color = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

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

