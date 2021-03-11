package graphique;

/**
 * Classe Dessin permettant la gestion plus facile de l'affichage, ainsi que de modifications, de plusieurs ObjetGraphique en même temps
 * @author Thibault DENIER
 *
 */

public class Dessin {
	private ObjetGraphique[] a_objs;
	private int a_nombreObjet;
	private int a_tailleTableau;
	
	/**
	 * Constructeur du dessin dont le nombre d'élément est défini au moment de la construction de ne peut pas être modifier par la suite
	 * @param nombreDElement	nombre d'éléments que peut retenir le Dessin, ATTENTION cette valeur ne peut être ni augmentée ni dépassée
	 */
	public Dessin(final int nombreDElement)
	{
		a_nombreObjet = 0;
		a_tailleTableau = nombreDElement;
		a_objs = new ObjetGraphique[a_tailleTableau];
	}
	
	/**
	 * Permet de récupérer la référence de l'ensemble des ObjetGraphique que le dessin connait
	 * @return
	 */
	public ObjetGraphique[] m_getObjetsGraphique() { return a_objs; }
	
	/**
	 * Setter du tableau de références d'ObjetGraphique
	 * @param objets nouveau tableau contenant les références aux ObjetGraphique que le Dessin doit gérer
	 */
	public void m_setObjetsGraphique(final ObjetGraphique[] objets) { a_objs = objets; }
	
	/**
	 * Permet d'ajouter un ObjetGraphique spécifique à la liste des ObjetGraphique que gère le Dessin
	 * @param obj ObjetGraphique à ajouter
	 */
	public void ajouterObjetGraphique(final ObjetGraphique obj)
	{
		if (a_nombreObjet < a_tailleTableau)
		{
			a_objs[a_nombreObjet] = obj;
			a_nombreObjet++;
		}
	}
	
	/**
	 * Permet de modifier la positio de tous les objets connu du Dessin de la même façon
	 * @param addX ajoute addX à la coordonnée X actuelle de tous les objets (addX > 0 permet de décaler tous les objets vers la droite et addX < 0 permet de décaler tous les objets vers la gauche)
	 * @param addY ajoute addY à la coordonnée Y actuelle de tous les objets (addY > 0 permet de décaler tous les objets vers le bas et addY < 0 permet de décaler tous les objets vers le haut)
	 */
	public void m_translation(final int addX, final int addY)
	{
		for (int i = 0; i < a_nombreObjet; i++)
		{
			a_objs[i].m_translation(addX,  addY);
		}
	}
	
	/**
	 * Permet d'effacer tous les ObjetGraphique connu par le Dessin avec leurs fonctions d'effacements respectives
	 */
	public void m_effacement()
	{
		for (int i = 0; i < a_nombreObjet; i++)
		{
			a_objs[i].m_effacement();
		}
	}
	
	/**
	 * Permet d'afficher tous les ObjetGraphique connu par le Dessin avec leurs fonctions de dessins respectives
	 */
	@Override
	public String toString()
	{
		String str = "";
		
		for (int i = 0; i < a_nombreObjet; i++)
		{
			str += a_objs[i] + "\n";
		}
		
		return str;
	}
}
