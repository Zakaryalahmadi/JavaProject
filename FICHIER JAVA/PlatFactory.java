import java.util.ArrayList;

public class PlatFactory extends Recette {

    private static ArrayList<Ingredient> tab = new ArrayList<>();

    public PlatFactory(String nom) {
        super(nom, tab);
    }

    public static final Recette CreerCouscous() throws ZeroCalException {
        Recette r1 = new Recette("Couscous", tab);

        Oeufs i0 = new Oeufs(3);

        Ingredient i1 = new Legumes("carotte", 4, 2);
        Legumes i2 = new Legumes("navet", 4, 2);
        i2.setFormeDecoupe("tranches");
        Legumes i3 = new Legumes("tomate", 4, 2);
        i3.setOutil("couteau");
        Ingredient i4 = new Legumes("courjette", 4, 2);
        Legumes i5 = new Legumes("pois chiches", "g", 100, 1.4, 30);
        i5.setPeau();
        Ingredient i6 = new Ingredient("Huile d'olive", " cuilliere", 3, 3.4, 30);

        Ingredient i7 = new Viande("pilons de poulet", 3, 3);

        Viande i8 = new Viande("merguez", 3, 3);

        i8.setTempsCuisson(10);
        i8.setDegreCuisson(50);

        AutoCuiseur m1 = new AutoCuiseur();

        r1.ajouterIngredient(i0);
        r1.ajouterIngredient(i1);
        r1.ajouterIngredient(i2);
        r1.ajouterIngredient(i3);
        r1.ajouterIngredient(i4);
        r1.ajouterIngredient(i5);
        r1.ajouterIngredient(i6);
        r1.ajouterIngredient(i7);
        r1.ajouterIngredient(i8);

        if (r1.calTot() <= 0) {
            throw new ZeroCalException();
        }

        System.out.println(r1.toString());
        r1.PreparerRecette();

        System.out.println(m1.IngredientAFaireChauffer(i7));

        m1.setEtat();
        System.out.println(m1.IngredientAFaireChauffer(i8));

        m1.setEtat();
        System.out.println(m1.toString());

        return r1;
    }

}
