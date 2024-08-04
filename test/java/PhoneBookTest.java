import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PhoneBookTest {
    PhoneBook book = new PhoneBook();
    @Test
    public void testAdd() {
        long num = 12334184, num2 = 5556135;
        String name = "John";
        int expected = 1;
        book.add(name, num);
        int actual = book.add(name, num2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByNumber() {
        long num = 12334184;
        String expected = "John";
        book.add(expected, num);
        String actual = book.findByNumber(num);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindByName() {
        String name = "John";
        long expected = 12334184;
        book.add(name, expected);
        long actual = book.findByName(name);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrintAllNames() {
        book.add("John", 12334184);
        book.add("John", 5556135);
        book.add("Matt", 89124523);
        book.add("Amy", 672108478);
        List<String> expected = List.of("Amy", "John", "Matt");
        Assertions.assertEquals(expected, book.printAllNames());
    }
}