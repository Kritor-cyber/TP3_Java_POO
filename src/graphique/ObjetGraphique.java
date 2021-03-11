package graphique;

/**
 * Classe ObjetGraphique abstraite car inutilisable en l'�tat mais permet une d�finition propre de tous les objets graphiques imaginables tel que les Ligne et les Cercle
 * @author Thibault DENIER
 *
 */

public abstract class ObjetGraphique {
	protected int a_x, a_y;
	protected TypeCouleur a_couleur;
	protected int a_epaisseurTrait;
	
	/**
	 * Constructeur pour les objets graphiques
	 * @param x					coordonn�e X de l'objet qui sera cr��
	 * @param y					coordonn�e Y de l'objet qui sera cr��
	 * @param couleur			couleur qu'aura l'objet � l'�cran (cf. TypeCouleur.java pour la liste compl�te des couleurs disponibles)
	 * @param epaisseurTrait	�paisseur qu'auront les traits permettant l'affichage de l'objet
	 */
	public ObjetGraphique(final int x, final int y, final TypeCouleur couleur, final int epaisseurTrait) {
		a_x = x;
		a_y = y;
		a_couleur = couleur;
		a_epaisseurTrait = epaisseurTrait;
	}
	
	/**
	 * Fonction qui permet de modifier la position d'un objet (si addX ou addY = 0 alors l'objet ne se d�calera pas selon cette coordonn�e)
	 * @param addX	ajoute addX � la coordonn�e X actuelle de l'objet (addX > 0 permet de d�caler l'objet vers la droite et addX < 0 permet de d�caler l'objet vers la gauche)
	 * @param addY	ajoute addY � la coordonn�e Y actuelle de l'objet (addY > 0 permet de d�caler l'objet vers le bas et addY < 0 permet de d�caler l'objet vers le haut)
	 */
	public void m_translation(final int addX, final int addY)
	{
		a_x += addX;
		a_y += addY;
	}

	/**
	 * Appeler cette fonction permet d'effacer l'objet de l'�cran
	 */
	public abstract void m_effacement();
	
	/**
	 * Appeler cette fonction permet d'afficher l'objet � l'�cran (sous forme de texte qui le d�crit)
	 */
	@Override
	public abstract String toString();

	/**
	 * Setter de la coordonn�e X (horizontale) de l'objet
	 * @param x	nouvelle coordonn�e X de l'objet
	 */
	public void m_setX(final int x) { a_x = x; }
	
	/**
	 * Setter de la coordonn�e Y (verticale) de l'objet
	 * @param y	nouvelle coordonn�e Y de l'objet
	 */
	public void m_setY(final int y) { a_y = y; }
	
	/**
	 * Setter de la couleur de l'objet
	 * @param couleur nouvelle couleur de l'objet
	 */
	public void m_setCouleur(final TypeCouleur couleur) { a_couleur = couleur; }

	/**
	 * Setter de l'�paisser des traits permettant l'affichage de l'objet
	 * @param epaisseurTrait nouvelle �paisser des traits de l'objet
	 */
	public void m_setEpaisseurTrait(final int epaisseurTrait) { a_epaisseurTrait = epaisseurTrait; }

	/**
	 * Permet de r�cup�rer la coordonn�e X (horizontal) de l'objet
	 * @return retourne la coordonn�e X actuelle
	 */
	public int m_getX() { return a_x; }
	
	/**
	 * Permet de r�cup�rer la coordonn�e Y (vertical) de l'objet
	 * @return retourne la coordonn�e Y actuelle
	 */
	public int m_getY() { return a_y; }
	
	/**
	 * Permet de r�cup�rer la couleur de l'objet
	 * @return retourne la couleur actuelle
	 */
	public TypeCouleur m_getCouleur() { return a_couleur; }
	
	/**
	 * Permet de r�cup�rer l'�paisser des traits utilis�s pour afficher l'objet
	 * @return retourne l'�paisseur actuelle
	 */
	public int m_getEpaisseurTrait() { return a_epaisseurTrait; }
}
