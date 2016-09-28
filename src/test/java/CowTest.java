import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CowTest {

    @Test
    public void createCow() {
        Cow newCow = new Cow(2016, "Matilda");

        assertEquals(2016, newCow.getBirthYear());

    }
}
