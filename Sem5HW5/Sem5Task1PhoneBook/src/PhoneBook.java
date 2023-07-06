import java.util.*;

class PhoneBook {
    private final Map<String, List<String>> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, new ArrayList<>());
        }
        contacts.get(name).add(phoneNumber);
    }

    public void printContacts() {
        TreeMap<String, List<String>> sortedContacts = new TreeMap<>(
                (a, b) -> Integer.compare(contacts.get(b).size(), contacts.get(a).size())
        );
        sortedContacts.putAll(contacts);

        for (Map.Entry<String, List<String>> entry : sortedContacts.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + "; Телефонные номера: " + entry.getValue());
        }
    }
}