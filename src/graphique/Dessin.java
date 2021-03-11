package graphique;

/**
 * Classe Dessin permettant la gestion plus facile de l'affichage, ainsi que de modifications, de plusieurs ObjetGraphique en m�me temps
 * @author Thibault DENIER
 *
 */

public class Dessin {
	private ObjetGraphique[] a_objs;
	private int a_nombreObjet;
	private int a_tailleTableau;
	
	/**
	 * Constructeur du dessin dont le nombre d'�l�ment est d�fini au moment de la construction de ne peut pas �tre modifier par la suite
	 * @param nombreDElement	nombre d'�l�ments que peut retenir le Dessin, ATTENTION cette valeur ne peut �tre ni augment�e ni d�pass�e
	 */
	public Dessin(final int nombreDElement)
	{
		a_nombreObjet = 0;
		a_tailleTableau = nombreDElement;
		a_objs = new ObjetGraphique[a_tailleTableau];
	}
	
	/**
	 * Permet de r�cup�rer la r�f�rence de l'ensemble des ObjetGraphique que le dessin connait
	 * @return
	 */
	public ObjetGraphique[] m_getObjetsGraphique() { return a_objs; }
	
	/**
	 * Setter du tableau de r�f�rences d'ObjetGraphique
	 * @param objets nouveau tableau contenant les r�f�rences aux ObjetGraphique que le Dessin doit g�rer
	 */
	public void m_setObjetsGraphique(final ObjetGraphique[] objets) { a_objs = objets; }
	
	/**
	 * Permet d'ajouter un ObjetGraphique sp�cifique � la liste des ObjetGraphique que g�re le Dessin
	 * @param obj ObjetGraphique � ajouter
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
	 * Permet de modifier la positio de tous les objets connu du Dessin de la m�me fa�on
	 * @param addX ajoute addX � la coordonn�e X actuelle de tous les objets (addX > 0 permet de d�caler tous les objets vers la droite et addX < 0 permet de d�caler tous les objets vers la gauche)
	 * @param addY ajoute addY � la coordonn�e Y actuelle de tous les objets (addY > 0 permet de d�caler tous les objets vers le bas et addY < 0 permet de d�caler tous les objets vers le haut)
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
