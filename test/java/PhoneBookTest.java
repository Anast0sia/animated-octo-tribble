import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        String actual = book.findByNumber(num);
        Assertions.assertEquals(expected, actual);
    }
}