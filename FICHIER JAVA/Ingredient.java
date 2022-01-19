public class Ingredient extends Preparation{
	private String nom;
	private String unite;
	private double quantite;
	private double prix;
	private double calories; // en cal
	protected final int id;
	public static int nb_ingredient = 0;


	public Ingredient(String nom, Double quantite) {
		nb_ingredient++;
		id = nb_ingredient;
		this.nom = nom;
		this.quantite = quantite;
		this.unite = "";
		this.prix = 0.0;
		this.calories = 155.;
	}

	public Ingredient(String nom, String unite,double quantite) {
		nb_ingredient++;
		id = nb_ingredient;
		this.nom = nom;
		this.unite = unite;
		this.quantite = quantite;
		this.calories = 155; // calories moyen d'un ingredient
		this.prix = 0;
	}
	public Ingredient(String nom, String unite,double quantite,double prix) {
		nb_ingredient++;
		id = nb_ingredient;
		this.nom = nom;
		this.unite = unite;
		this.quantite = quantite;
		this.prix = prix;
		this.calories = 155;
	}

	public Ingredient(String nom, double quantite,double prix,double calories) {
		nb_ingredient++;
		id = nb_ingredient;
		this.nom = nom;
		this.calories = calories;
		this.quantite = quantite;
		this.unite = "";
		this.prix = prix;
	}

	public Ingredient(String nom, String unite, double quantite, double prix, double calories) {
		nb_ingredient++;
		id = nb_ingredient;
		this.calories = calories;
		this.nom = nom;
		this.unite = unite;
		this.quantite = quantite;
		this.prix = prix;
		this.calories = calories;
	}

	public Ingredient(String nom, double quantite, double prix) {
		nb_ingredient++;
		id = nb_ingredient;
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
		this.unite = "";
		this.calories = 155;
    }

    public Ingredient clone(){
		return new Ingredient(this.nom,this.unite, this.quantite,this.prix,this.calories);
	}
	
	public String getNom() {
		return this.nom;
	}

	public String getUnite() {
		return this.unite;
	}

	public double getCalories() {
		return calories;
	}

	public double getQuantite() {
		return quantite;
	}

	public double getPrix() {
		return prix;
	}

	public int getId() {
		return id;
	}

	public static int getNb_ingredient() {
		return nb_ingredient;
	}

	public void PreparerIngredient() {
		if (this instanceof Legumes) {
			this.PreparerIngredient();
		} else if (this instanceof Epices) {
			this.PreparerIngredient();
		} else if (this instanceof Oeufs) { 
			this.PreparerIngredient();
		}  else if (this instanceof Viande) { 
			this.PreparerIngredient();
		}else {
			System.out.println("Preparer "+ this.getQuantite()+ this.getUnite()+ " " + this.nom + "s.");
		}
	}

	public String toString() {
		
 		return "nom = " + this.getNom() + ", quantite : " + this.getQuantite() + this.getUnite() + ", Prix : "
				+ this.getPrix() + " euro, et represente " + this.getCalories() + " cal";
	}

	


}