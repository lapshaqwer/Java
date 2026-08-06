public class Cat {
    String name;
    String ownername;
    int age;
    int food;
    boolean isHungry;

    void owner() {
        if (ownername.equals("Ульяна")) {
            name = "Мальта";
        }
    }

    void meow() {
        System.out.println("%s :Meow".formatted(name));
    }

    void meowmeow() {
        if (food <= 3) {
            System.out.println("Хочу кушать");
        }
    }
}
