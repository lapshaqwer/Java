import java.util.*;

public class Number {
    static private Map<String, List<String>> contacts = new HashMap<>();

     public static void addPhone(String name, String phone) {
        contacts.computeIfAbsent(name, _ -> new ArrayList<>()).add(phone);
        }

    static public void printAll() {
        if (contacts.isEmpty()) {
            System.out.print("В телефонной книге отсутствуют номера");
        } else {
            for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}
