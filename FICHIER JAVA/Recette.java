import java.util.ArrayList;

public class Recette {

    private ArrayList<Ingredient> tab;
    private String nom;
    private int nbIngredient;

    public Recette(String nom, ArrayList<Ingredient> tab) {
        this.tab = tab;
        this.nom = nom;
        nbIngredient = tab.size();
    }

    public double prixRecette() {
        double res = 0;
        for (Ingredient ingredient : tab) {
            res += ingredient.getPrix();
        }
        return res;
    }

    public void ajouterIngredient(Ingredient i) {
        tab.add(i);
        nbIngredient++;
    }

    public String getNom() {
        return nom;
    }

    public int getNbIngredient() {
        return nbIngredient;
    }

    public double calTot(){
        double res = 0;
        for (Ingredient ingredient : tab) {
            res += ingredient.getCalories();
        }
        return res;
    }

    public void estSuffisant() {
        int calories = 0;
        for (Ingredient ingredient : tab) {
            calories += ingredient.getCalories();
        }
        if (calories >= 600) {
            System.out.println("Ce repas confere un apport caloriques suffisant !");
        } else {
            System.out.println("Apres ce repas, il vous manquera surement quelques calories !");
        }
    }

     

    public void PreparerRecette() {
        System.out.println("----------------");
        System.out.println("| Preparations:|");
        System.out.println("----------------");
        for (Ingredient ingredient : tab) {
            ingredient.PreparerIngredient();
        }
    }

    public String toString() {
        String s = "--------------------------------------------------------------------------------------------- \n";
        s += "Recette : " + nom + ". " + " Prix : " + prixRecette() + "euro(s)" + ". " + "Nombre d'Ingredients : "
                + getNbIngredient() + ".\n" + "Liste des Ingredients : \n";
        s += "--------------------------------------------------------------------------------------------- \n";

        for (Ingredient ingredient : tab) {
            s += "\n[" + ingredient.toString() + "]";
        }
        return s;
    }
}