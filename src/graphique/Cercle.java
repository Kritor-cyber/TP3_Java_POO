package graphique;

/**
 * Classe Cercle issue de la classe ObjetGraphique qui permet de créer des objets dont l'affichage sera un cercle
 * @author Thibault DENIER
 *
 */

public class Cercle extends ObjetGraphique {

	private int a_rayon;
	
	/**
	 * Constructeur spécifiques aux Ligne
	 * @param x					coordonnée X du cercle qui sera créé
	 * @param y					coordonnée Y du cercle qui sera créé
	 * @param couleur			couleur qu'aura le cercle à l'écran (cf. TypeCouleur.java pour la liste complète des couleurs disponibles)
	 * @param epaisseurTrait	épaisseur qu'auront les traits permettant l'affichage du cercle
	 * @param rayon				rayon du cercle
	 */
	public Cercle(final int x, final int y, final TypeCouleur couleur, final int epaisseurTrait, final int rayon) {
		super(x, y, couleur, epaisseurTrait);
		a_rayon = rayon;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Setter du rayon du cercle
	 * @param rayon nouveau rayon du cercle
	 */
	public void m_setRayon(final int rayon) { a_rayon = rayon; }

	/**
	 * Permet de connaitre le rayon du cercle
	 * @return retourne le rayon actuelle
	 */
	public int m_getRayon() { return a_rayon; }
	
	@Override
	public void m_effacement() {
		// TODO Auto-generated method stub
		System.out.println("Effacement du cercle d'origine (" + a_x + " ; " + a_y + "), de rayon " + a_rayon + " et de couleur " + a_couleur + " de l'écran...");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Affichage du cercle d'origine (" + a_x + " ; " + a_y + "), de rayon " + a_rayon + " et de couleur " + a_couleur + " de l'écran...";
	}

}
