public class Cat {
    String nameC;
    String catOwnerName;
    private int ageC;
    int foodC;
    //boolean isHungry;

    public int setAgeC(int NewAgeC) {
        ageC = NewAgeC;
        return ageC;
    }

    public int getAgeC() {
        return this.ageC;
    }

    void owner() {
        if (catOwnerName.equalsIgnoreCase("Ульяна") || catOwnerName.equalsIgnoreCase("Uliana")) {
            nameC = "Мальта";
        } else {
            System.out.print("Безхозная кошка");
            nameC = "Безхозная кошка";
        }
    }

    void meow() {
        System.out.println(nameC + " : Мяу");
    }

    void meowmeow() {
        if (foodC <= 3) {
            System.out.println(nameC + " хочет кушать");
        }
    }
}
