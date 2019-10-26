package zoo;


import zoo.animal.Animal;
import zoo.animal.Cat;
import zoo.animal.Dog;

public class ZooParkApplication {
    public static void main(String[] args) {
        Cat cat = new Cat("Гав", false, false);
        Cat cat2 = new Cat("неГав", false, true);
        Dog dog = new Dog("Шарик", true, false);
        Dog notDog = new Dog("Ковер", false, true);

        Animal[] zooArray = new Animal[]{cat, dog,cat2, notDog};

        for (Animal animal : zooArray) {
            animal.introduce();
        }

    }
}
