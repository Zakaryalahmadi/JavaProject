public class Epices extends Ingredient {

    public Epices(String nom,double quantite, double prix) {
        super(nom, "g", quantite, prix);
    }

    public void PreparerIngredient(){
        System.out.println("Ajouter " + this.getQuantite()+ this.getUnite()+" " + this.getNom());
    }
    

}