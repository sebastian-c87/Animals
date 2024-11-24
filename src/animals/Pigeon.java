package animals;

public class Pigeon extends Bird{
    private String species;

    // Konstruktor domyślny
    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    // Konstruktor z wszystkimi parametrami
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    // Konstruktor z częścią parametrów
    public Pigeon(String name, String species) {
        super(name);
        this.species = species;
    }

    // Metody dostępowe
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon is pecking grains.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the pigeon coos.");
    }

    // Dodatkowa metoda
    public void navigate() {
        System.out.println(getName() + " is navigating home.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Pigeon[" + super.toString() + ", species=" + species + "]";
    }
}
