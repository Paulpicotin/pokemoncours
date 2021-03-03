package main;

import core.Bonbon;
import core.Espece;
import core.Pokemon;
import core.UtilisationType;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Espece bulbizarre = new Espece();
		bulbizarre.setNom("bulbizarre");
		bulbizarre.setNumero(1);
		bulbizarre.setType("PLANTE");
		bulbizarre.setPvBase(100);
		bulbizarre.setForceBase(10);
		
		Pokemon pokemon = new Pokemon(bulbizarre, "Mon bulbizarre");
		pokemon.setTaille(2);
		
		System.out.println(pokemon.getSurnom()+" : niveau "+pokemon.getNiveau());
		System.out.println(pokemon.toString()); 
		System.out.println(pokemon); // équivalent à la ligne précédente
		
		for (int i = 0; i < 100; i++) {
			pokemon.gagnerExperience(10);
			System.out.println(pokemon);
		}
		
		Bonbon bonbon = new Bonbon(UtilisationType.UTILISATION_UNIQUE,"bonbon", 100000 );
		bonbon.setNom("reglisse > Dragibus");
		bonbon.setXp(4);
		
		pokemon.mangerBonbon(bonbon);
		System.out.println(pokemon);
		pokemon.mangerBonbon(bonbon);
		System.out.println(pokemon);
		
		Espece salameche = new Espece();
		salameche.setNom("salamèche");
		salameche.setNumero(2);
		salameche.setType("FEU");
		salameche.setPvBase(50);
		salameche.setForceBase(15);
		
		Pokemon adversaire = new Pokemon(salameche, "Méchant salamèche");
		while (pokemon.getPv() > 0 && adversaire.getPv() > 0) {
			pokemon.attaquer(adversaire);
			adversaire.attaquer(pokemon);
		}
		
		System.out.println("Fin du combat");
		
		Pokemon gagnant = adversaire;
		if (adversaire.getPv() <= 0) {
			gagnant = pokemon;
		}
		
		gagnant.gagnerExperience(5);
		System.out.println("Victoire de "+gagnant);
		
		Random random = new Random();
		
		Espece especeRandom = new Espece();
		especeRandom.setNom("espece aleatoire") ;
		especeRandom.setNumero(3);
		especeRandom.setType("EAU");
		especeRandom.setPvBase(200);
		especeRandom.setForceBase(50);
		
		
	}
}
