import java.util.Scanner;
//
//

class Main {
    static void main(String[] args) {
        Scanner catScanner = new Scanner(System.in);
        Scanner dogScanner = new Scanner(System.in);
        Scanner catAgeScanner = new Scanner(System.in);


        Cat cat1 = new Cat();
        Dog dog1 = new Dog();


        System.out.print("Введите имя хозяина кошки\n");
        cat1.catOwnerName = catScanner.nextLine();
        cat1.owner();
        System.out.print("Введите возраст кошки\n");
        cat1.setAgeC(catAgeScanner.nextInt());
        System.out.print("Мальте " + cat1.getAgeC() + " лет\n");
        cat1.meow();
        System.out.print("Введите количество корма:\n");
        cat1.foodC = catScanner.nextInt();
        cat1.meowmeow();


        System.out.print("Введите имя хозяина собаки\n");
        dog1.dogOwnerName = dogScanner.nextLine();
        dog1.owner();
        dog1.setAgeD(9);
        System.out.println(dog1.getNameD() + ": С использованием геттера");
        dog1.bark();
        System.out.print("Введите количество корма:\n");
        dog1.foodD = dogScanner.nextInt();
        dog1.barkbark();
        }
        }

