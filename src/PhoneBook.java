import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/*
 * Класс компаратора для сортировки класса PhoneBook().
 * Меняя местами o2 и o1 можем менять направление сортировки: возрастание/убывание.
 */
class CompareBook implements Comparator<Entry<String, Phone>> {
    @Override
    public int compare(Entry<String, Phone> o1, Entry<String, Phone> o2) {
        return o2.getValue().size() - o1.getValue().size();
    }
}

/*
 * Собственно класс телефонной книги
 */
public class PhoneBook {

    private final Map<String, Phone> book = new HashMap<>();

    public void put(String name, String phoneNum)
    {
        if (book.containsKey(name))
            book.get(name).add(phoneNum);           // добавляем телефон к существующей записи
        else
            book.put(name, new Phone(phoneNum));    // создаём новую запись
    }

    /*
        Метод 1.
        Сортировка через массив ArrayList и метод .sort()
     */
    public String toString()
    {
        List<Entry<String, Phone>> list = new ArrayList<>(book.entrySet());
        list.sort(new CompareBook());
        return list.toString();
    }

    /*
        Метод 2.
        Сортировка через stream, с использованием нашего класса сортировки
     */
//    public String toString()
//    {
//        List<Map.Entry<String, Phone>> sortedList = book.entrySet().stream()
//                .sorted(new CompareBook())
//                .toList();
//        return sortedList.toString();
//    }

    /*
        Метод 3.
        Сортировка через stream и лямбду
     */
//    public String toString()
//    {
//        List<Map.Entry<String, Phone>> sortedList = book.entrySet().stream()
//                .sorted((e1, e2) -> e2.getValue().size()-e1.getValue().size())
//                .toList();
//        return sortedList.toString();
//    }

}
