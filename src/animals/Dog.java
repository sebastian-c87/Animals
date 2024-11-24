package animals;

public class Dog extends Mammal{
    private String breed;

    // Konstruktor domyślny
    public Dog() {
        super();
        this.breed = "Unknown";
    }

    // Konstruktor z wszystkimi parametrami
    public Dog(String name, int age, double weight, int furThickness, String breed) {
        super(name, age, weight, furThickness);
        this.breed = breed;
    }

    // Konstruktor z częścią parametrów
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Metody dostępowe
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Nadpisane metody
    @Override
    public void eat() {
        System.out.println(getName() + " the dog is eating dog food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " the dog barks.");
    }

    // Dodatkowa metoda
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Dog[" + super.toString() + ", breed=" + breed + "]";
    }
}
