import org.junit.*;
import static org.junit.Assert.assertEquals;

public class CowTest {
    private Cow cow;

    @Before
    public void initialize() {
        this.cow = new Cow(2016, "Matilda");

    }

    @Test
    public void createCow() {
        assertEquals(2016, this.cow.getBirthYear());
    }

    @Test
    public void getCowName() {
        assertEquals("Matilda", this.cow.getName());
    }

    @Test
    public void pooTest() {
//        bajsbajsbajsbajs
        assertEquals("Poo", "Poo");
    }


}
