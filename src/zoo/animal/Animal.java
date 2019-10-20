package zoo.animal;

public abstract class Animal {
    private String name;
    private boolean isPredator;

    public Animal(String name, boolean isPredator) {
        this.name = name;
        this.isPredator = isPredator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public abstract void introduce();

}
