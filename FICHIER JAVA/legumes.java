public class Legumes extends Ingredient implements PeauIngredient, Forme {

    private boolean peau = true; // par defaut chaque legume est epluchable

    private String formeDecoupe = "cubes"; // valeur par defaut

    private String outil = "epluche-legume";

    public Legumes(String nom, String unite, double quantite, double prix, double calories) {
        super(nom, unite, quantite, prix, calories);
    }

    public Legumes(String nom, double quantite, double prix) {
        super(nom, quantite, prix);
    }

    @Override
    public boolean enleverPeau() {
        return this.peau;
    }

    @Override
    public String outilEnleverPeau(String outil) {
        this.outil = outil;
        return this.outil;
    }

    public void setPeau() { // chaque legume est par defaut epluchable on peut changer si au cas ou on veut
                            // pas eplucher un legume
        if (peau)
            peau = false;
        else
            peau = true;
    }

    public String setOutil(String nOutil) {
        this.outil = nOutil;
        return this.outil;
    }

    /*
     * public void PreparerIngredient(){
     * if(this.peau) System.out.println("A l'aide d'un " +
     * this.outilEnleverPeau(outil) +" Epluchez " + this.getQuantite()+ " " +
     * this.getNom() + "s" + " et decouper ce dernier en " +
     * this.decouper(formeDecoupe));
     * else System.out.println("Preparez " + this.getQuantite()+ " de " +
     * this.getNom() + "s.");
     * }
     */

    @Override
    public String decouper(String methodeDeDecoupage) {
        this.formeDecoupe = methodeDeDecoupage;
        return this.formeDecoupe;
    }

    public String setFormeDecoupe(String formeDe) {
        this.formeDecoupe = formeDe;
        return formeDecoupe;
    }

}