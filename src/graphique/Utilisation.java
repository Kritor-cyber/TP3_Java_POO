package graphique;

/**
 * Classe Utilisation contenant la fonction main d'entrée du programme qui utilise les fonctions ObjetGraphique / Cercle / Ligne / Dessin
 * @author Thibault DENIER
 *
 */

public class Utilisation {

	public static void main(String[] args) {
		
		ObjetGraphique obj1 = new Ligne(1, 2, TypeCouleur.rouge_feu, 5, 20, 45);
		System.out.println(obj1);
		obj1.m_effacement();
		obj1.m_translation(-1, -1);
		
		System.out.println("\n");
		
		ObjetGraphique obj2 = new Cercle(1, 2, TypeCouleur.bleu_céleste, 2, 48);
		System.out.println(obj2);
		obj2.m_effacement();
		obj2.m_translation(1, 1);
		
		Dessin zoneDeDessin = new Dessin(2);
		zoneDeDessin.ajouterObjetGraphique(obj1);
		zoneDeDessin.ajouterObjetGraphique(obj2);
		zoneDeDessin.m_translation(10, 10);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println(zoneDeDessin);
		zoneDeDessin.m_effacement();
	}

}
