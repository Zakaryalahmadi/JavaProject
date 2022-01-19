public class Cuisine {
    public static void main(String[] args) {

        try {
            PlatFactory.CreerCouscous();
        } catch (ZeroCalException e) {

            e.printStackTrace();
        }

        System.out.println("--------------------------------------------");
        System.out.println("-----------FIN DE LA PREPARATION -----------");
        System.out.println("--------------------------------------------");

    }
}
