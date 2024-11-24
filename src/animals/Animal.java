package animals;

public class Animal {
    private String name;
    private int age;
    private double weight;

    // Konstruktor domyślny
    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.weight = 0.0;
    }

    // Konstruktor z wszystkimi parametrami
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Konstruktor z częścią parametrów
    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.weight = 0.0;
    }

    // Metody dostępowe
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Metody
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void getVoice() {
        System.out.println(name + " makes a sound.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Animal[name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}

