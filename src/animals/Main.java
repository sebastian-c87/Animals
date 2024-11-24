package animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        // Inicjalizacja obiektów za pomocą różnych konstruktorów
        animals[0] = new Dog("Buddy", 3, 20.5, 5, "Golden Retriever");
        animals[1] = new Pigeon("Sky", "Rock Pigeon");
        animals[2] = new Blowfish("Puffy", 2, 1.2, 0.5, 30);
        animals[3] = new Mammal("MammalName", 4);
        animals[4] = new Fish("Goldie", 0.2);
        animals[5] = new Bird();

        // Wywołanie metod na obiektach
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.eat();
            animal.getVoice();

            // Metody specyficzne dla typów
            if (animal instanceof Dog) {
                ((Dog) animal).fetch();
            } else if (animal instanceof Pigeon) {
                ((Pigeon) animal).navigate();
            } else if (animal instanceof Blowfish) {
                ((Blowfish) animal).inflate();
            } else if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            } else if (animal instanceof Fish) {
                ((Fish) animal).swim();
            } else if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }

            System.out.println();
        }
    }
}
