import java.util.Objects;
public class Chimpanzee extends Animal{
    private String name;

    public Chimpanzee(float height, float weight, Colors color, String name) {
        super(height, weight, color);
        this.name = name;
    }
    @Override
    public void makeSound() {
        System.out.println("U-u-ua-ua!");
    }

    @Override
    public void feed() {
        eat(0.7f);
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
        Chimpanzee that = (Chimpanzee) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "weight after feeding = " + weight + '}';
    }
}
