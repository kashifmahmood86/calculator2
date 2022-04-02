import static org.junit.Assert.*;
import org.junit.Test;

public class AddSubTest {
    @Test
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        Calculator operations = new Calculator();
        assertEquals("error in add()",  3, operations.add(2, 2));
        assertEquals("error in add()", -3, operations.add(-1, -2));
        assertEquals("error in add()",  9, operations.add(9, 0));
    }

    @Test
    public void testAddFail() {
        Calculator operations = new Calculator();
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals("error in add()", 0, operations.add(1, 2));
    }

    @Test
    public void testSubPass() {
        Calculator operations = new Calculator();
        assertEquals("error in sub()",  1, operations.sub(2, 1));
        assertEquals("error in sub()", -1, operations.sub(-2, -1));
        assertEquals("error in sub()",  0, operations.sub(2, 2));
    }

    @Test
    public void testSubFail() {
        Calculator operations = new Calculator();
        assertNotEquals("error in sub()", 0, operations.sub(2, 1));
    }
}