package core;

public class Bonbon  extends Objet {

	private int xp;
	private String nom;
	private boolean dejaConsomme = false;

	public Bonbon(UtilisationType utilisationType, String nom_objet, int prix_objet) {
		super(utilisationType, nom_objet, prix_objet);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public boolean isDejaConsomme() {
		return dejaConsomme;
	}

	public void setDejaConsomme(boolean dejaConsomme) {
		this.dejaConsomme = dejaConsomme;
	}
}
