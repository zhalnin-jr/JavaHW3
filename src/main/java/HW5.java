
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class HW5 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Григорий Жалнин", "88002202023");
        phoneBook.addContact("Григорий Жалнин", "79670907904");
        phoneBook.addContact("Екатерина Бабичева", "79037999999");
        phoneBook.addContact("Екатерина Бабичева", "84957999999");
        phoneBook.addContact("Павел Павлович", "84957999999");

        System.out.println(phoneBook.getPhoneNumbers("Григорий Жалнин"));
        System.out.println(phoneBook.getAllContacts());
    }
}
class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String NameSurname, String phoneNumber) {
        if (phoneBook.containsKey(NameSurname)) {
            List<String> numbers = phoneBook.get(NameSurname);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(NameSurname, numbers);
        }
    }

    public List<String> getPhoneNumbers(String NameSurname) {
        return phoneBook.getOrDefault(NameSurname, new ArrayList<>());
    }

    public List<String> getAllContacts() {
        return phoneBook.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                .map(entry -> entry.getKey() + ": " + entry.getValue().toString())
                .collect(Collectors.toList());
        }
}



