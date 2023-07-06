// Реализуйте структуру телефонной книги с помощью HashMap. Программа также должна учитывать, что во входной структуре
// будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "1234567890");
        phoneBook.addContact("Иван", "0987654321");
        phoneBook.addContact("Софья", "2345678901");
        phoneBook.addContact("Федор", "3456789012");
        phoneBook.addContact("Федор", "4567890123");
        phoneBook.addContact("Федор", "5678901234");

        phoneBook.printContacts();
    }
}