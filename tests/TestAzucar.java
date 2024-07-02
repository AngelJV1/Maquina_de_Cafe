// JavaScript source code

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestAzucar{
    Azucarero azucarero;

    @Before
    public void setUp(){
        azucarero=new Azucarero(10);
    }

    @Test
    public void RestAzucar(){
        azucarero.giveAzucar(5);
        
        assertEquals(5,azucarero.getCantidadAzucar());

        azucarero.giveAzucar(2);

        assertEquals(3,azucarero.getCantidadAzucar());
    }

	@Test
    public void TrueHasAzucar(){
        boolean resultado=azucarero.hasAzucar(5);

        assertEquals(true,resultado);

        resultado=azucarero.hasAzucar();

        assertEquals(true,resultado);
    }

    
}