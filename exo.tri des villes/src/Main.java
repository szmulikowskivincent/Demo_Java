import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static listVilles ListeVilles;

    public static void main(String[] args) {
        List<Ville> villes = ListeVilles.initialiserListeVilles();

        String continentActuel = "";
        for (Ville ville : villes) {
            if (!ville.continent.equals(continentActuel)) {
                continentActuel = ville.continent;
            }
        }

        // Tri des villes par continent puis par population
        Map<String, List<Ville>> villesParContinent = villes.stream()
                .collect(Collectors.groupingBy(Ville::getContinent));

        // Affichage des villes triées par continent puis par population
        System.out.println("\nVilles triées par continent puis par population :");
        villesParContinent.forEach((continent, villesContinent) -> {
            System.out.println("Continent : " + continent);
            afficherTableau(villesContinent);
        });
    }

    // Méthode pour afficher les villes dans un tableau
    private static void afficherTableau(List<Ville> villes) {
        System.out.println("+------------------+-----------+-------------+");
        System.out.println("| Nom de la Ville   | Continent | Population  |");
        System.out.println("+------------------+-----------+-------------+");

        for (Ville ville : villes) {
            System.out.printf("| %-16s | %-9s | %-11d |\n", ville.getNom(), ville.getContinent(), ville.getPopulation());
        }
    }
}



