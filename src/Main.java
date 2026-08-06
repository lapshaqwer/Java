import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner catScanner = new Scanner(System.in);
        Scanner dogScanner = new Scanner(System.in);
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.nameC = "Barsik";
        cat1.ageC = 3;
        System.out.print("Введите имя хозяина кошки\n");
        cat1.catOwnerName = catScanner.nextLine();
        cat1.owner();
        cat1.meow();
        System.out.print("Введите количество корма:\n");
        cat1.foodC = catScanner.nextInt();
        cat1.meowmeow();

        dog1.nameD = "Персик";
        dog1.ageD = 1;
        System.out.print("Введите имя хозяина собаки\n");
        dog1.dogOwnerName = dogScanner.nextLine();
        dog1.owner();
        dog1.bark();
        System.out.print("Введите количество корма:\n");
        dog1.foodD = dogScanner.nextInt();
        dog1.barkbark();
        }
        }

