public class Dog {
    String nameD;
    String dogOwnerName;
    int ageD;
    int foodD;

    void owner() {
        if (dogOwnerName.equals("Никита")) {
            nameD = "Моника";
        } else {
            System.out.println("Безхозная собака");
        }
    }

    void bark() {
        System.out.printf("%s: Гав\n".formatted(nameD));
    }

    void barkbark() {
        if (foodD <= 10) {
            System.out.println("%s хочет кушать".formatted(nameD));
        }
    }

}
