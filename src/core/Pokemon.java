package core;

public class Pokemon {
	
	private static int currentId = 0;
	private static final int NIVEAU_MAX = 5;
	private int id;
	private Espece espece;
	private final String surnom;
	private float taille;
	private int niveau = 1;
	private int xp = 0;
	private int pv = 100;
	private int force = 10;
	
	public Pokemon(Espece espece, String surnom) {
		this.espece = espece;
		this.id = currentId;
		currentId++;
		this.surnom = surnom;
		this.pv = espece.getPvBase();
		this.force = espece.getForceBase();
	}

	public Espece getEspece() { return espece;	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public static int getCurrentId() {
		return currentId;
	}

	public int getForce() {
		return force;
	}

	public int getId() {
		return id;
	}

	public int getNiveau() {
		return niveau;
	}

	public static int getNiveauMax() {
		return NIVEAU_MAX;
	}

	public int getPv() {
		return pv;
	}

	public int getXp() {
		return xp;
	}

	public String getSurnom() {
		return surnom;
	}

	public void gagnerExperience(int nbXP) {
		this.xp += nbXP;
		int nouveauNiveau = Niveau.niveauCorrespondant(xp);
		this.niveau = nouveauNiveau;
	}
	
	public void mangerBonbon(Bonbon bonbon) {
		if (!bonbon.isDejaConsomme()) {
			this.gagnerExperience(bonbon.getXp());
			bonbon.setDejaConsomme(true);
		}
	}
	
	public void attaquer(Pokemon cible) {
		cible.pv = cible.pv - force;
	}

	public String toString() {
		return "Pokemon [id=" + id + ", espece=" + espece + ", surnom=" + surnom + ", taille=" + taille + ", niveau="
				+ niveau + ", xp=" + xp + ", pv=" + pv + ", force=" + force + "]";
	}

	

	

	
	
	

}
