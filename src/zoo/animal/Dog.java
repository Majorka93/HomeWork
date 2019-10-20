package zoo.animal;

public class Dog extends Animal {

    private boolean isSecurity;

    public Dog(String name, boolean isPredator, boolean isSecurity) {
        super(name, isPredator);
        this.isSecurity = isSecurity;
    }

    public boolean isSecurity() {
        return isSecurity;
    }

    @Override
    public void introduce() {
        System.out.println("Имя Собаки: " + getName() + " Хишник: " + isPredator() + " Охранник: " + isSecurity());


    }
}
