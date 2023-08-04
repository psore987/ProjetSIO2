package pack1;

public class Colis {
	
	// variables
	private int longueur;
	private int largeur;
	private int profondeur;
	private float poids;
	private int typeRecommande;
	
	private final int LONGUEURMAX = 100; 
	private final int SOMMEDESLONGMAX = 150;

	
	//constructeurs
	
	public Colis() {
		this(0,0,0,0,0); //délégation de constructeur
	}
	
	public Colis(int longueur, int largeur, int profondeur, float poids, int typeRecommande) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
		this.profondeur = profondeur;
		this.poids = poids;
		this.typeRecommande = typeRecommande;
	}

	
	//accesseurs et mutateurs
	
	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public int getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(int profondeur) {
		this.profondeur = profondeur;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public int getTypeRecommande() {
		return typeRecommande;
	}

	public void setTypeRecommande(int typeRecommande) {
		this.typeRecommande = typeRecommande;
	}
	
	public float volume() {
		return longueur * largeur * profondeur;

	}
	
	public float densite() {
		return poids / volume();
	}
	
	public boolean estValide() {
		if ((longueur + largeur + profondeur > SOMMEDESLONGMAX ) || (longueur > LONGUEURMAX )) {
			return false;
		} else
			return true;
	}

}
