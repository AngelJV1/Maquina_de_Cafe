import static org.junit.Assert.*;

import org.junit.Test;

public class TestVaso {

    @Test
    public void TrueEXistenciaVasos() {
        Vaso VasosPequeños = new Vaso(2, 10);

        boolean resultado = VasosPequeños.hasVasos(1);

        assertEquals(true, resultado);
    }

    @Test
    public void FalseExistenciaVasos() {
        Vaso VasosPequeños = new Vaso(1, 10);

        boolean resultado = VasosPequeños.hasVasos(2);

        assertEquals(false, resultado);
    }

    @Test
    public void RestCantidadVasos() {
        Vaso vasosPequeños = new Vaso(5, 10);

        vasosPequeños.giveVasos(1);

        assertEquals(4, vasosPequeños.getCantidadVaso());
    }

}