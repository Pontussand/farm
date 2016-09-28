import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CowTest {

    @Test
    public void createCow() {
        Cow newCow = new Cow(2016, "Matilda");

        assertEquals(2016, newCow.getBirthYear());

    }

    @Test
    public void getCowName() {
        Cow cow = new Cow(2016, "Melinda");

        assertEquals("Melinda", cow.getName());
    }
}
