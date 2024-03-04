public class Main {
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.put("Иванов", "8-953-283-36-92");
        book.put("Петров", "73-28-92");
        book.put("Сидорова", "+7-927-783-29-11");
        book.put("Иванов", "(8412) 63-96-97");
        book.put("Иванов", "+7-902-204-80-09");
        book.put("Сидорова", "63-02");

        System.out.println(book);
    }
}