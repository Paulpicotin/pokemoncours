package core;

public class Pokemon {
	
	public static int currentId = 0;
	public static final int NIVEAU_MAX = 5;
	public int id;
	public Espece espece;
	public final String surnom;
	public float taille;
	public int niveau = 1;
	public int xp = 0;
	public int pv = 100;
	public int force = 10;
	
	public Pokemon(Espece espece, String surnom) {
		this.espece = espece;
		this.id = currentId;
		currentId++;
		this.surnom = surnom;
		this.pv = espece.pvBase;
		this.force = espece.forceBase;
	}
	
	public void gagnerExperience(int nbXP) {
		this.xp += nbXP;
		int nouveauNiveau = Niveau.niveauCorrespondant(xp);
		this.niveau = nouveauNiveau;
	}
	
	public void mangerBonbon(Bonbon bonbon) {
		if (!bonbon.dejaConsomme) {
			this.gagnerExperience(bonbon.xp);
			bonbon.dejaConsomme = true;
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
