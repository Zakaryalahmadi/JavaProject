public abstract class Machine{
    private String nom;
    private boolean etat = false; // la machine est des le depart ferme

    public Machine(String nom){
        this.nom = nom;
    }

    public void setEtat(){
        if(this.etat) this.etat = false;
        else this.etat = true;
    }

    

    public String getNom(){
        return this.nom;
    }

    public boolean getEtat(){
        return this.etat;
    }

    public abstract String utility();


    public String toString() {
        String s = " ";
        if(etat) s = "ouvrir " + this.nom;
        else s = "fermer " + this.nom;

        return s;
    }

}
