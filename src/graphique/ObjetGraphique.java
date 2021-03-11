package graphique;

/**
 * Classe ObjetGraphique abstraite car inutilisable en l'état mais permet une définition propre de tous les objets graphiques imaginables tel que les Ligne et les Cercle
 * @author Thibault DENIER
 *
 */

public abstract class ObjetGraphique {
	protected int a_x, a_y;
	protected TypeCouleur a_couleur;
	protected int a_epaisseurTrait;
	
	/**
	 * Constructeur pour les objets graphiques
	 * @param x					coordonnée X de l'objet qui sera créé
	 * @param y					coordonnée Y de l'objet qui sera créé
	 * @param couleur			couleur qu'aura l'objet à l'écran (cf. TypeCouleur.java pour la liste complète des couleurs disponibles)
	 * @param epaisseurTrait	épaisseur qu'auront les traits permettant l'affichage de l'objet
	 */
	public ObjetGraphique(final int x, final int y, final TypeCouleur couleur, final int epaisseurTrait) {
		a_x = x;
		a_y = y;
		a_couleur = couleur;
		a_epaisseurTrait = epaisseurTrait;
	}
	
	/**
	 * Fonction qui permet de modifier la position d'un objet (si addX ou addY = 0 alors l'objet ne se décalera pas selon cette coordonnée)
	 * @param addX	ajoute addX à la coordonnée X actuelle de l'objet (addX > 0 permet de décaler l'objet vers la droite et addX < 0 permet de décaler l'objet vers la gauche)
	 * @param addY	ajoute addY à la coordonnée Y actuelle de l'objet (addY > 0 permet de décaler l'objet vers le bas et addY < 0 permet de décaler l'objet vers le haut)
	 */
	public void m_translation(final int addX, final int addY)
	{
		a_x += addX;
		a_y += addY;
	}

	/**
	 * Appeler cette fonction permet d'effacer l'objet de l'écran
	 */
	public abstract void m_effacement();
	
	/**
	 * Appeler cette fonction permet d'afficher l'objet à l'écran (sous forme de texte qui le décrit)
	 */
	@Override
	public abstract String toString();

	/**
	 * Setter de la coordonnée X (horizontale) de l'objet
	 * @param x	nouvelle coordonnée X de l'objet
	 */
	public void m_setX(final int x) { a_x = x; }
	
	/**
	 * Setter de la coordonnée Y (verticale) de l'objet
	 * @param y	nouvelle coordonnée Y de l'objet
	 */
	public void m_setY(final int y) { a_y = y; }
	
	/**
	 * Setter de la couleur de l'objet
	 * @param couleur nouvelle couleur de l'objet
	 */
	public void m_setCouleur(final TypeCouleur couleur) { a_couleur = couleur; }

	/**
	 * Setter de l'épaisser des traits permettant l'affichage de l'objet
	 * @param epaisseurTrait nouvelle épaisser des traits de l'objet
	 */
	public void m_setEpaisseurTrait(final int epaisseurTrait) { a_epaisseurTrait = epaisseurTrait; }

	/**
	 * Permet de récupérer la coordonnée X (horizontal) de l'objet
	 * @return retourne la coordonnée X actuelle
	 */
	public int m_getX() { return a_x; }
	
	/**
	 * Permet de récupérer la coordonnée Y (vertical) de l'objet
	 * @return retourne la coordonnée Y actuelle
	 */
	public int m_getY() { return a_y; }
	
	/**
	 * Permet de récupérer la couleur de l'objet
	 * @return retourne la couleur actuelle
	 */
	public TypeCouleur m_getCouleur() { return a_couleur; }
	
	/**
	 * Permet de récupérer l'épaisser des traits utilisés pour afficher l'objet
	 * @return retourne l'épaisseur actuelle
	 */
	public int m_getEpaisseurTrait() { return a_epaisseurTrait; }
}
