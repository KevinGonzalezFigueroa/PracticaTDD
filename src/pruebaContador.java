import static org.junit.Assert.*;
import org.junit.Test;

public class pruebaContador {
    @Test
        public void testCrearContador() {
            contador c2 = new contador(0, 2, 6);
            assertNotNull(c2);
        }

    @Test
        public void testCrearContadorUnParametro() {
            contador c2 = new contador(6);
            assertNotNull(c2);
        }

    @Test
        public void testContadorIncrementando() {
            contador c2 = new contador(0, 2, 6);
    
            int expectedResult = 2;

            assertEquals(expectedResult, c2.aumentar());
        }

    @Test
        public void testContadorIncrementandoSuperandoLimite() {
            contador c2 = new contador(0, 3, 2);
    
            int expectedResult = 0;

            assertEquals(expectedResult, c2.aumentar());
        }

    @Test
        public void testContadorResetear() {
            contador c2 = new contador(0, 1, 2);
    
            int expectedResult = 0;

            assertEquals(expectedResult, c2.resetear());
        }
}
