import java.util.Objects;

public class Animal {
    protected float height;
    protected float weight;
    protected Colors color;

    public Animal(float height, float weight, Colors color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public void makeSound() {
        System.out.println("...");
    }

    public void feed() {}

    public void eat(float food) {
        weight += food;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Float.compare(animal.height, height) == 0 && Float.compare(animal.weight, weight) == 0 && color == animal.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
