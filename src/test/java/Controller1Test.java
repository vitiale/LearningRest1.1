import Controllers.Controller1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Controller1Test {
    private Controller1 controller1 = new Controller1();

    @Test
    @DisplayName("First Test")
    public void divNTest(){
        Controller1 c1 = new Controller1();
        assertEquals(10.0, c1.divN(100, 10));
    }

    @Test
    @DisplayName("Second Test")
    public void divNAricmeticalError(){
        Controller1 c2 = new Controller1();
        assertThrows(ArithmeticException.class, () -> c2.divN(10, 0));
    }

    @Test
    @DisplayName("3HT Test")
    public void divNTrue(){
        Controller1 c3 = new Controller1();
        assertTrue(c3.criteria);
    }
}
