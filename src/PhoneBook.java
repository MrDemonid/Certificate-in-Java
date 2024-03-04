import java.util.*;
import java.util.Map.Entry;

/*
 * Класс компаратора для сортировки класса PhoneBook()
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

    private Map<String, Phone> book = new HashMap<>();


    public void put(String name, String phoneNum)
    {
        if (book.containsKey(name))
        {
            book.get(name).add(phoneNum);           // добавляем телефон к существующей записи
        } else {
            book.put(name, new Phone(phoneNum));    // создаём новую запись
        }
    }

    public String toString()
    {
        List<Entry<String, Phone>> entries = new ArrayList<>(book.entrySet());
        entries.sort(new CompareBook());

        return entries.toString();
    }
}
