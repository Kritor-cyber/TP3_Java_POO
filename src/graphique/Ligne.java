package graphique;

/**
 * Classe Ligne issue de la classe ObjetGraphique qui permet de créer des objets dont l'affichage sera une ligne
 * @author Thibault DENIER
 *
 */

public class Ligne extends ObjetGraphique {

	private int a_longueur;
	private double a_angle;
	
	/**
	 * Constructeur spécifiques aux Ligne
	 * @param x					coordonnée X de la ligne qui sera créé
	 * @param y					coordonnée Y de la ligne qui sera créé
	 * @param couleur			couleur qu'aura la ligne à l'écran (cf. TypeCouleur.java pour la liste complète des couleurs disponibles)
	 * @param epaisseurTrait	épaisseur qu'auront les traits permettant l'affichage de la ligne
	 * @param longueur			longueur de nombre ligne
	 * @param angle				angle qui permet de définir l'orientation de notre ligne dans le sens trigonométrique (0° = horizontal de gauche à droite / 90° = vers le haut / 180° = horizontal de droite à gauche / 270° = -90° = vers le bas)
	 */
	public Ligne(final int x, int y, final TypeCouleur couleur, final int epaisseurTrait, final int longueur, final double angle) {
		super(x, y, couleur, epaisseurTrait);
		a_longueur = longueur;
		a_angle = angle;
	}

	/**
	 * Setter de la longueur de la ligne
	 * @param longueur	nouvelle longueur de la ligne
	 */
	public void m_setLongueur(final int longueur) { a_longueur = longueur; }
	
	/**
	 * Setter de l'orientation de la ligne
	 * @param angle	permet de définir l'orientation de la ligne (0° = horizontal de gauche à droite / 90° = vers le haut / 180° = horizontal de droite à gauche / 270° = -90° = vers le bas)
	 */
	public void m_setAngle(final double angle) { a_angle = angle; }

	/**
	 * Permet de récupérer la longueur de la ligne
	 * @return retourne la longueur actuelle
	 */
	public int m_getLongueur() { return a_longueur; }

	/**
	 * Permet de récupérer l'orientation de la ligne sous la forme d'un angle
	 * @return retourne l'angle actuelle définissant l'orientation de la ligne
	 */
	public double m_getAngle() { return a_angle; }
	
	@Override
	public void m_effacement() {
		// TODO Auto-generated method stub
		System.out.println("Effacement de la ligne d'origine (" + a_x + " ; " + a_y + "), de longueur " + a_longueur + ", d'angle " + a_angle + " et de couleur " + a_couleur + " de l'écran...");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Affichage de la ligne d'origine (" + a_x + " ; " + a_y + "), de longueur " + a_longueur + ", d'angle " + a_angle + " et de couleur " + a_couleur + " de l'écran...";
	}

}
