package core;

public class Niveau {

	private static final int XP_NIVEAU_1 = 0;
	private static final int XP_NIVEAU_2 = 5;
	private static final int XP_NIVEAU_3 = 15;
	private static final int XP_NIVEAU_4 = 30;
	private static final int XP_NIVEAU_5 = 100;

	public static int niveauCorrespondant(int xp) {
		//Alerte, ce code est horrible, il doit être retravaillé quand on aura vu les tableaux / collections
		if (xp > XP_NIVEAU_5) {
			return 5;
		}
		if (xp > XP_NIVEAU_4) {
			return 4;
		}
		if (xp > XP_NIVEAU_3) {
			return 3;
		}
		if (xp > XP_NIVEAU_2) {
			return 2;
		}
		if (xp > XP_NIVEAU_1) {
			return 1;
		}
		return 0;
	}

}
