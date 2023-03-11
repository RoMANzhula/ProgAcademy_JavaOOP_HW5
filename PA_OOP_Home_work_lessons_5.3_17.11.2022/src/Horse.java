import java.util.Objects;

public class Horse extends Animal{
    private String name;

    public Horse(float height, float weight, Colors color, String name) {
        super(height, weight, color);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Igo-go-go!");
    }

    @Override
    public void feed() {
        eat(15.5f);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return name.equals(horse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight after feeding = " + weight + '}';
    }
}
