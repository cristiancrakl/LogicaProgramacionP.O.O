package continentesRepresentados;

class Developer {
    String primerNombre;
    String lastName;
    String country;
    String continent;
    int age;
    String language;

    public Developer(String primerNombre, String lastName, String country, String continent, int age, String language) {
        this.primerNombre = primerNombre;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
    }

    // PARA ACCEDER A LOS ATRIBUTOS
    public String getprimerNombre() {
        return primerNombre;
    }

    public String getContinent() {
        return continent;
    }

    public String getLanguage() {
        return language;
    }
}