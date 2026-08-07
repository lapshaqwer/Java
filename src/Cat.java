public class Cat extends Animal {
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
            System.out.print("Безхозная кошка\n");
            nameC = "Безхозная кошка";
        }
    }

    String newNameC() {
        return nameC;
    }

    @Override
    void sound() {
        System.out.println(nameC + " мяукает");
    }

    void meowmeow() {
        if (foodC <= 3) {
            System.out.println(nameC + " хочет кушать");
        }
    }
}
