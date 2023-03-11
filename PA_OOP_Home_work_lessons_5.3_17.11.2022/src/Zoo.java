import java.util.Scanner;

public class Zoo {
    public static Animal[] animals = new Animal[3];

    public void returnOurAnimals() {
        System.out.println("Hello dear visitor. Welcome to our Zoo!");
        for (int i = 0; i < animals.length; i++) {
            animals[0] = new Horse(2.5f, 350.5f, Colors.WHITE, "Horse");
            animals[1] = new Chimpanzee(0.8f, 22.5f, Colors.BLACK, "Chimpanzee");
            animals[2] = new Kangaroo(1.8f, 54.3f, Colors.YELLOW, "Kangaroo");
        }

        System.out.println("We have animal feeding tour.");
        System.out.println("Our ticket costs 59.99 UAH. Do you have enough money? Y/N");
    }

    public void feedingTour() {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toLowerCase();
        Visitor visitor = new Visitor("Visitor", 150.60f);

        if (visitor.getMoney() >= 59.99 && str.equals("y")) {
            System.out.println("There are such animals in our Zoo:");
            for (Animal animal : animals) {
                System.out.println(animal);
            }

            System.out.println(visitor.getName() + ", welcome to feeding tour! What animal do you want to feed?");
        } else {
            System.out.println("Good luck!");
        }

        while (scanner.hasNext()) {
        String feeding = scanner.nextLine().toLowerCase();

            if (feeding.equals("horse")) {
                animals[0].makeSound();
                animals[0].feed();
                System.out.println(animals[0]);

            } else if (feeding.equals("chimpanzee")) {
                animals[1].makeSound();
                animals[1].feed();
                System.out.println(animals[1]);

            } else if (feeding.equals("kangaroo")) {
                animals[2].makeSound();
                animals[2].feed();
                System.out.println(animals[2]);

            } else if (feeding.equals("stop")){
                System.out.println("Thanks for visiting our zoo. Until next meeting!");
                break;
            } else {
                System.out.println("There is no such animal in our zoo!");
            }
        }
    }
}
