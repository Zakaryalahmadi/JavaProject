public class Oeufs extends Ingredient implements PeauIngredient {

    private static String nom = "Oeuf";

    private String outil = "Ouvre-oeuf";
   
    public static String singulierPluriel(double q){
        if(q > 1) nom = "Oeufs";
        return nom;
    }

    public Oeufs(double quantite, double prix, double calories) {
        super(singulierPluriel(quantite), quantite, prix, calories);
    }

    public Oeufs(double quantite,double prix) {
        super(singulierPluriel(quantite),quantite,prix);
    }

    public Oeufs(double quantite) {
        super(singulierPluriel(quantite),quantite);
    }

   

    @Override
    public boolean enleverPeau() {
        return true;
    }


    @Override
    public String outilEnleverPeau(String outil) {
        this.outil = outil;
        return this.outil;
    }

    public void PreparerIngredient(){
        System.out.println("A l'aide d'un "+ this.outilEnleverPeau(outil)+ " ouvrez " + this.getQuantite() + " " + this.getNom());
    }

    

    

}