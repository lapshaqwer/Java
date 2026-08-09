import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//
//

class Main {
    static void main(String[] args) {
        int password = 222;
        int pass;

        Number number = new Number();
        InputHandler s = new InputHandler();
        Delay td = new Delay();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.print("Добро пожаловать\n");
        td.timeDelay();
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

        System.out.print("Выберите программу:\n1.Кошка\n2.Собака\n3.Телефонная книга\n4.Выход\n");
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
                System.out.print("1. Внести номер\n2. Просмотреть телефонную книгу\n");
                int a = InputHandler.readInt();
                switch (a) {
                    case 1:
                        for (; ; ) {
                            System.out.print("Для добавления номера в книгу, введите имя:\n");
                            String nm = InputHandler.readStr();
                            td.timeDelay();
                            System.out.print("Введите номер:\n");
                            String ph = InputHandler.readStr();
                            td.timeDelay();
                            System.out.print("Номер успешно добавлен\n");
                            Number.addPhone(nm, ph);
                            System.out.print("Для выхода - введите 'C'\n");
                            String b = InputHandler.readStr();
                            if (b.equalsIgnoreCase("C") || b.equalsIgnoreCase("С")) {
                                break;
                            }
                        }
                    case 2:
                        System.out.print("Телефонная книга:\n");
                        Number.printAll();
                }
            case 4:
        }
    }
}







