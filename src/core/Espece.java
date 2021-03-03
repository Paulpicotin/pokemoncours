package core;

public class Espece {
	
	private int numero;
	private String nom;
	private String type;
	private int pvBase;
	private int forceBase;
	
	public String toString() {
		return "Espece [numero=" + numero + ", nom=" + nom + ", type=" + type + ", pvBase=" + pvBase + ", forceBase="
				+ forceBase + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPvBase() {
		return pvBase;
	}

	public void setPvBase(int pvBase) {
		this.pvBase = pvBase;
	}

	public int getForceBase() {
		return forceBase;
	}

	public void setForceBase(int forceBase) {
		this.forceBase = forceBase;
	}
}
