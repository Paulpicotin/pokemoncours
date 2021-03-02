package main;

import java.util.Random;

import core.Bonbon;
import core.Espece;
import core.Pokemon;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Espece bulbizarre = new Espece();
		bulbizarre.nom = "Bulbizarre";
		bulbizarre.numero = 1;
		bulbizarre.type = "PLANTE";
		bulbizarre.pvBase = 100;
		bulbizarre.forceBase = 10;
		
		Pokemon pokemon = new Pokemon(bulbizarre, "Mon bulbizarre");
		pokemon.taille = 2;
		
		System.out.println(pokemon.surnom+" : niveau "+pokemon.niveau);
		System.out.println(pokemon.toString()); 
		System.out.println(pokemon); // équivalent à la ligne précédente
		
		for (int i = 0; i < 100; i++) {
			pokemon.gagnerExperience(10);
			System.out.println(pokemon);
		}
		
		Bonbon bonbon = new Bonbon();
		bonbon.nom = "Dragibus";
		bonbon.xp = 4;
		
		pokemon.mangerBonbon(bonbon);
		System.out.println(pokemon);
		pokemon.mangerBonbon(bonbon);
		System.out.println(pokemon);
		
		Espece salameche = new Espece();
		salameche.nom = "Salamèche";
		salameche.numero = 2;
		salameche.type = "FEU";
		salameche.pvBase = 50;
		salameche.forceBase = 15;
		
		Pokemon adversaire = new Pokemon(salameche, "Méchant salamèche");
		while (pokemon.pv > 0 && adversaire.pv > 0) {
			pokemon.attaquer(adversaire);
			adversaire.attaquer(pokemon);
		}
		
		System.out.println("Fin du combat");
		
		Pokemon gagnant = adversaire;
		if (adversaire.pv <= 0) {
			gagnant = pokemon;
		}
		
		gagnant.gagnerExperience(5);
		System.out.println("Victoire de "+gagnant);
		
		Random random = new Random();
		
		Espece especeRandom = new Espece();
		especeRandom.nom = "Espece aléatoire";
		especeRandom.numero = 3;
		especeRandom.type = "EAU";
		especeRandom.pvBase = random.nextInt(200);
		especeRandom.forceBase = random.nextInt(50);
		
		
	}
}
