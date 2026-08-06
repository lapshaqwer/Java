import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat1 = new Cat();

        cat1.name = "Barsik";
        cat1.age = 3;
        cat1.ownername = scanner.nextLine();
        cat1.food = scanner.nextInt();


        cat1.owner();
        cat1.meow();
        cat1.meowmeow();
        }
        }

