package animals;

public class Mammal extends Animal {
    private int furThickness;

    // Konstruktor domyślny
    public Mammal() {
        super();
        this.furThickness = 0;
    }

    // Konstruktor z wszystkimi parametrami
    public Mammal(String name, int age, double weight, int furThickness) {
        super(name, age, weight);
        this.furThickness = furThickness;
    }

    // Konstruktor z częścią parametrów
    public Mammal(String name, int furThickness) {
        super(name);
        this.furThickness = furThickness;
    }

    // Metody dostępowe
    public int getFurThickness() {
        return furThickness;
    }
    public Mammal(String name) {
        super(name);
        this.furThickness = 0; // Domyślna wartość lub inna odpowiednia
    }
    public void setFurThickness(int furThickness) {
        this.furThickness = furThickness;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the mammal is eating plants.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the mammal makes a mammal sound.");
    }

    // Dodatkowa metoda
    public void run() {
        System.out.println(getName() + " is running.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + ", furThickness=" + furThickness + "]";
    }
}

