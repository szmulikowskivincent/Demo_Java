import java.util.ArrayList;
import java.util.List;

public class listVilles {
    public static List<Ville> initialiserListeVilles() {
        List<Ville> villes = new ArrayList<>();

        System.out.println("-----------------------");

        // Autres régions//
        System.out.println("--Continent Divers--");
        villes.add(new Ville("Le Cap", "Afrique", 433688));
        villes.add(new Ville("Wellington", "Océanie", 215400));
        villes.add(new Ville("Mexico", "Amérique", 9209944));
        villes.add(new Ville("Moscou", "Europe", 12615882));

        //Europe//
        System.out.println("--Continent Européen--");
        villes.add(new Ville("Paris", "Europe", 2200000));
        villes.add(new Ville("Londres", "Europe", 8900000));
        villes.add(new Ville("Berlin", "Europe", 3600000));
        villes.add(new Ville("Madrid", "Europe", 3300000));
        villes.add(new Ville("Rome", "Europe", 2870000));
        villes.add(new Ville("Athènes", "Europe", 664046));
        villes.add(new Ville("Amsterdam", "Europe", 821752));
        villes.add(new Ville("Vienne", "Europe", 1888776));
        villes.add(new Ville("Stockholm", "Europe", 975904));
        villes.add(new Ville("Varsovie", "Europe", 1764615));

        //Afrique//
        System.out.println("--Continent Africain--");
        villes.add(new Ville("Cape Town", "Afrique", 4000000));
        villes.add(new Ville("Le Caire", "Afrique", 9900000));
        villes.add(new Ville("Lagos", "Afrique", 14900000));
        villes.add(new Ville("Kinshasa", "Afrique", 14800000));
        villes.add(new Ville("Johannesburg", "Afrique", 4434827));
        villes.add(new Ville("Nairobi", "Afrique", 4397073));
        villes.add(new Ville("Casablanca", "Afrique", 3359818));
        villes.add(new Ville("Alger", "Afrique", 2661000));
        villes.add(new Ville("Abidjan", "Afrique", 4765000));
        villes.add(new Ville("Lusaka", "Afrique", 1920205));
        villes.add(new Ville("Addis-Abeba", "Afrique", 3240000));


        //Amérique//
        System.out.println("--Continent Amerciain--");
        villes.add(new Ville("New York", "Amérique", 8538000));
        villes.add(new Ville("Los Angeles", "Amérique", 3976000));
        villes.add(new Ville("Mexico", "Amérique", 9209944));
        villes.add(new Ville("São Paulo", "Amérique", 12252023));
        villes.add(new Ville("Toronto", "Amérique", 2731571));
        villes.add(new Ville("Buenos Aires", "Amérique", 2891000));
        villes.add(new Ville("Lima", "Amérique", 975904));
        villes.add(new Ville("Bogotá", "Amérique", 7102602));
        villes.add(new Ville("Rio de Janeiro", "Amérique", 6747815));
        villes.add(new Ville("Chicago", "Amérique", 2705994));


        // Asie//
        System.out.println("--Continent Asiatique--");
        villes.add(new Ville("Tokyo", "Asie", 13929286));
        villes.add(new Ville("Shanghai", "Asie", 24256800));
        villes.add(new Ville("Mumbai", "Asie", 12478447));
        villes.add(new Ville("Pékin", "Asie", 21516000));
        villes.add(new Ville("Istanbul", "Asie", 15462476));


        // Océanie//
        System.out.println("--Continent Océanique--");
        villes.add(new Ville("Sydney", "Océanie", 5312163));
        villes.add(new Ville("Auckland", "Océanie", 1650647));
        villes.add(new Ville("Melbourne", "Océanie", 5078000));


        // Moyen-Orient//
        System.out.println("--Continent Orientale--");
        villes.add(new Ville("Dubaï", "Moyen-Orient", 3137000));
        villes.add(new Ville("Riyad", "Moyen-Orient", 7900000));
        villes.add(new Ville("Téhéran", "Moyen-Orient", 8695000));

        // Amérique du Sud//
        System.out.println("--Continent Amerique du Sud--");
        villes.add(new Ville("Lima", "Amérique du Sud", 975904));
        villes.add(new Ville("Caracas", "Amérique du Sud", 2873946));
        villes.add(new Ville("Montevideo", "Amérique du Sud", 1381002));
        
        // Ajouter un titre
        System.out.println("Villes non triées :");

        // Afficher les données sous forme de tableau
        System.out.printf("%-15s%-15s%-15s\n", "Ville", "Continent", "Population");
        System.out.println("-----------------------------------------------");
        for (Ville ville : villes) {
            System.out.printf("%-20s%-20s%-20d\n", ville.getNom(), ville.getContinent(), ville.getPopulation());
            for (int i = 0; i < 0; i++) {
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------");

        return villes;
    }

    public static void main(String[] args) {
        initialiserListeVilles();
    }
}


