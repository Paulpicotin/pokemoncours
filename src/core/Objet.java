package core;

public abstract class Objet {
    private String nomObjet;
    private int prixObjet;
    private UtilisationType utilisationType;

    public Objet(UtilisationType utilisationType, String nom_objet, int prix_objet) {
        this.utilisationType =utilisationType;
        this.nomObjet = nom_objet;
        this.prixObjet= prix_objet;
    }
}
