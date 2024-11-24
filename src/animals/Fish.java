package animals;

public class Fish extends Animal {
    private double swimSpeed;

    // Konstruktor domyślny
    public Fish() {
        super();
        this.swimSpeed = 0.0;
    }

    // Konstruktor z wszystkimi parametrami
    public Fish(String name, int age, double weight, double swimSpeed) {
        super(name, age, weight);
        this.swimSpeed = swimSpeed;
    }

    // Konstruktor z częścią parametrów
    public Fish(String name, double swimSpeed) {
        super(name);
        this.swimSpeed = swimSpeed;
    }
    public Fish(String name) {
        super(name);
        this.swimSpeed = 0.0;
    }

    // Metody dostępowe
    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the fish is eating algae.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the fish makes bubbling sounds.");
    }

    // Dodatkowa metoda
    public void swim() {
        System.out.println(getName() + " is swimming at " + swimSpeed + " m/s.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Fish[" + super.toString() + ", swimSpeed=" + swimSpeed + "]";
    }
}
