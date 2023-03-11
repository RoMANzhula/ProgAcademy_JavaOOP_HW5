import java.util.Objects;

public class Kangaroo extends Animal{
    private String name;
    public Kangaroo(float height, float weight, Colors color, String name) {
        super(height, weight, color);
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Ha-haaa-haaa!");
    }

    @Override
    public void feed() {
        eat(3.5f);
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
        Kangaroo kangaroo = (Kangaroo) o;
        return name.equals(kangaroo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "weight after feeding = " + weight + '}';
    }
}
