import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaContador {
    @Test
        public void testCrearContador() {
            contador c2 = new contador(0, 2, 6);
            assertNotNull(c2);
        }
}
