public class Viande extends Ingredient implements Cuisson{

    private int tempsDeCuisson = 30; // valeur par defaut
    private int degreDeCuisson = 45;

    public Viande(String nom, Double quantite) {
        super(nom, quantite);
    }

    public Viande(String nom, int q, int p) {
        super(nom, q , p);
    }

    public int setTempsCuisson(int ntemps){
        this.tempsDeCuisson = ntemps;
        return tempsDeCuisson;
    }

    public int setDegreCuisson(int nDegre){
        this.degreDeCuisson = nDegre;
        return degreDeCuisson;
    }

    public void PreparerIngredient(){
        System.out.println("Preparez "+ this.getQuantite() + " " + this.getNom() + " qui necessitera " + this.tempsCuisson() + "min de cuisson a environ " + this.DegreCuisson() + "degres");
    }

    @Override
    public int tempsCuisson() {
        
        return this.tempsDeCuisson;
    }

    @Override
    public int DegreCuisson() {
        
        return this.degreDeCuisson;
    }

    
    
}
