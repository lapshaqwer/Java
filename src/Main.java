import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//
//

class Main {
    static void main(String[] args) {
        int password = 2212144;
        int pass;


        InputHandler s = new InputHandler();
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
            pass = InputHandler.readInt();
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
        int num = InputHandler.readInt();
        switch (num) {
            case 1:
                System.out.print("Введите имя хозяина кошки\n");
                cat1.catOwnerName = InputHandler.readStr();
                cat1.owner();
                System.out.print("Введите возраст кошки\n");
                cat1.setAgeC(InputHandler.readInt());
                System.out.print(cat1.newNameC() + " " + cat1.getAgeC() + " лет\n");
                cat1.sound();
                System.out.print("Введите количество корма:\n");
                cat1.foodC = InputHandler.readInt();
                cat1.meowmeow();
                return;

            case 2:
                System.out.print("Введите имя хозяина собаки\n");
                dog1.dogOwnerName = InputHandler.readStr();
                dog1.owner();
                dog1.setAgeD(9);
                System.out.print(dog1.getNameD() + ": С использованием геттера\n");
                dog1.sound();
                System.out.print("Введите количество корма:\n");
                dog1.foodD = InputHandler.readInt();
                dog1.barkbark();
                return;
            case 3:
                return;
        }
    }
}







