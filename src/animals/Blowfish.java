package animals;

public class Blowfish extends Fish{
    private int numberOfSpikes;

    // Konstruktor domyślny
    public Blowfish() {
        super();
        this.numberOfSpikes = 0;
    }

    // Konstruktor z wszystkimi parametrami
    public Blowfish(String name, int age, double weight, double swimSpeed, int numberOfSpikes) {
        super(name, age, weight, swimSpeed);
        this.numberOfSpikes = numberOfSpikes;
    }

    // Konstruktor z częścią parametrów
    public Blowfish(String name, int numberOfSpikes) {
        super(name);
        this.numberOfSpikes = numberOfSpikes;
    }

    // Metody dostępowe
    public int getNumberOfSpikes() {
        return numberOfSpikes;
    }

    public void setNumberOfSpikes(int numberOfSpikes) {
        this.numberOfSpikes = numberOfSpikes;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish is eating small crustaceans.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the blowfish makes a gulping sound.");
    }

    // Dodatkowa metoda
    public void inflate() {
        System.out.println(getName() + " inflates and shows its spikes.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Blowfish[" + super.toString() + ", numberOfSpikes=" + numberOfSpikes + "]";
    }
}
