public class Dog extends Animal {
    String nameD;
    String dogOwnerName;
    private int ageD = 9;
    int foodD;

    public void setAgeD (int newAgeD) {
        if (newAgeD > 1 && newAgeD < 10) {
            ageD = newAgeD;
            System.out.println("Все отлично");
        } else {
            System.out.println("Число должно быть от 1 до 10!");
        }
    }


    void owner() {
        if (dogOwnerName.equalsIgnoreCase("Никита") || dogOwnerName.equalsIgnoreCase("Nikita")) {
            nameD = "Моника";
        } else {
            System.out.print("Безхозная собака");
            nameD = "Безхозная собака";
        }
    }

    public String getNameD() {
        return nameD;
    }

    @Override
    void sound() {
        System.out.println(nameD + " гавкает");
    }

    void barkbark() {
        if (foodD <= 10) {
            System.out.println(nameD + " хочет кушать");
        }
    }

}
