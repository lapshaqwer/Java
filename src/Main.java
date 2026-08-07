import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//
//

class Main {
    static void main(String[] args) {
        int password = 2212144;
        int pass;

        Scanner numScanner = new Scanner(System.in);
        Scanner pasScanner = new Scanner(System.in);
        Scanner catScanner = new Scanner(System.in);
        Scanner dogScanner = new Scanner(System.in);
        Scanner catAgeScanner = new Scanner(System.in);


        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.print("Добро пожаловать\n");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("Ожидание прервано");
        }

        System.out.print("Введите пароль:\n");
        for (int i = 0; i <= 4 ; i++ ) {
            pass = pasScanner.nextInt();
            if (pass == password) {
                System.out.print("Успешный вход\n");
                break;
            } else if (i == 3){
                System.out.print("Вход запрещен, превышен лимит\n");
                return;
            } else {
                System.out.println("Неверный пароль, попробуйте еще раз\n");
            }
        }

        System.out.print("Выберите программу:\n1.Кошка\n2.Собака\n3.Выход\n");
        int num = numScanner.nextInt();
        switch (num) {
            case 1:
                System.out.print("Введите имя хозяина кошки\n");
                cat1.catOwnerName = catScanner.nextLine();
                cat1.owner();
                System.out.print("Введите возраст кошки\n");
                cat1.setAgeC(catAgeScanner.nextInt());
                System.out.print(cat1.newNameC() + " " + cat1.getAgeC() + " лет\n");
                cat1.sound();
                System.out.print("Введите количество корма:\n");
                cat1.foodC = catScanner.nextInt();
                cat1.meowmeow();
                return;

            case 2:
                System.out.print("Введите имя хозяина собаки\n");
                dog1.dogOwnerName = dogScanner.nextLine();
                dog1.owner();
                dog1.setAgeD(9);
                System.out.print(dog1.getNameD() + ": С использованием геттера\n");
                dog1.sound();
                System.out.print("Введите количество корма:\n");
                dog1.foodD = dogScanner.nextInt();
                dog1.barkbark();
                return;
            case 3:
                return;
        }
    }
}







