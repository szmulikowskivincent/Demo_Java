class Ville {
    private String nom;
    public String continent;
    private int population;

    public Ville(String nom, String continent, int population) {
        this.nom = nom;
        this.continent = continent;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public String getContinent() {
        return continent;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }
    public String toHTMLString() {
        return "<p>Ville{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}' + "</p>";
    }
}

