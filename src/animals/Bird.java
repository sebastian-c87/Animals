package animals;

public class Bird extends Animal{
    private String featherColor;

    // Konstruktor domyślny
    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    // Konstruktor z wszystkimi parametrami
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    // Konstruktor z częścią parametrów
    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }
    public Bird(String name) {
        super(name);
        this.featherColor = "Unknown";}

    // Metody dostępowe
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the bird is eating seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the bird chirps.");
    }

    // Dodatkowa metoda
    public void fly() {
        System.out.println(getName() + " is flying.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Bird[" + super.toString() + ", featherColor=" + featherColor + "]";
    }
}
