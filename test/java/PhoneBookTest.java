import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook book = new PhoneBook();
        long num = 12334184, num2 = 5556135;
        String name = "John";
        int expected = 1;
        book.add(name, num);
        int actual = book.add(name, num2);
        Assertions.assertEquals(expected, actual);
    }
}