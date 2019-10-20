package zoo.animal;

public class Cat extends Animal {

    private boolean isSterilized;

    public Cat(String name, boolean isPredator, boolean isSterilized) {
        super(name, isPredator);
        this.isSterilized = isSterilized;
    }

    public boolean isSterilized() {
        return isSterilized;
    }


    @Override
    public void introduce() {
        System.out.println("Имя Кошки: " + getName() + ", Хишница: " + isPredator() + ", Стерилизованная: " + isSterilized());
    }
}
