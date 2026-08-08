import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);


    public static String readStr() {
        String str = scanner.nextLine();
        return str;
    }


    public static int readInt() {
        while (true) {
            try {
                int num = scanner.nextInt();
                scanner.nextLine();
                return num;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число\n");
            }
        }
    }



    public static void close() {
        scanner.close();
    }
}

