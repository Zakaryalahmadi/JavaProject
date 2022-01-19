public class AutoCuiseur extends Machine{

    public AutoCuiseur() {
        super("L'Autocuiseur");
    }

    public String utility(){
        return "faire chauffer";
    }

    public String IngredientAFaireChauffer(Ingredient i){
        this.setEtat();
        System.out.println(this.toString());
        String s = this.utility() + " " + i.getQuantite() + i.getUnite() +" " + i.getNom();
        
        return s;
    }
    
}
