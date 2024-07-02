import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCafetera {
    @Test
    public void TrueExistenciaCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(5);

        assertEquals(true, resultado);
    }

    @Test
    public void FalseExistenciaCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(11);

        assertEquals(false, resultado);
    }

    @Test
    public void RestCafe() {
        Cafetera cafetera = new Cafetera(10);

        cafetera.giveCafe(7);

        assertEquals(3,cafetera.getCantidadCafe());
    }

}