public class Cat {
    String nameC;
    String catOwnerName;
    int ageC;
    int foodC;
    boolean isHungry;

    void owner() {
        if (catOwnerName.equals("Ульяна")) {
            nameC = "Мальта";
        } else {
            System.out.println("Безхозная кошка");
        }
    }

    void meow() {
        System.out.println("%s: Мяу".formatted(nameC));
    }

    void meowmeow() {
        if (foodC <= 3) {
            System.out.println("Хочу кушать");
        }
    }
}
