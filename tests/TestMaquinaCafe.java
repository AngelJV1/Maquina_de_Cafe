import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaquinaCafe {
	Cafetera cafetera;
	Vaso vasoPequeño;
	Vaso vasoMediano;
	Vaso vasoGrande;
	Azucarero azucarero;
	MaquinaCafe maquinaCafe;

	@Before
	public void setUp() {
		cafetera = new Cafetera(50);
		vasoPequeño = new Vaso(5, 10);
		vasoMediano = new Vaso(5, 20);
		vasoGrande = new Vaso(5, 30);
		azucarero = new Azucarero(20);

		maquinaCafe = new MaquinaCafe();
		maquinaCafe.setCafetera(cafetera);
		maquinaCafe.setVasosPequeños(vasoPequeño);
		maquinaCafe.setVasosMediano(vasoMediano);
		maquinaCafe.setVasosGrande(vasoGrande);
		maquinaCafe.setAzucarero(azucarero);
	}

	@Test
	public void ReturnVasoPequeño() {
		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		assertEquals(maquinaCafe.vasosPequeño, vaso);
	}

	@Test
	public void ReturnVasoMediano() {
		MaquinaCafe maquinaCafe = new MaquinaCafe();

		Vaso vaso = maquinaCafe.getTipoVaso("mediano");

		assertEquals(maquinaCafe.vasosMediano, vaso);
	}

	@Test
	public void ReturnVasoGrande() {

		Vaso vaso = maquinaCafe.getTipoVaso("grande");

		assertEquals(maquinaCafe.vasosGrande, vaso);
	}

	@Test
	public void NoVasos() {

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		String resultado = maquinaCafe.getVasoCafe(vaso, 10, 2);

		assertEquals("No hay Vasos", resultado);
	}

	@Test
	public void NoCafe() {

		cafetera = new Cafetera(5);
		maquinaCafe.setCafetera(cafetera);

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		String resultado = maquinaCafe.getVasoCafe(vaso, 1, 2);

		assertEquals("No hay Cafe", resultado);
	}

	@Test
	public void NoAzucar() {

		azucarero = new Azucarero(2);
		maquinaCafe.setAzucarero(azucarero);

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		String resultado = maquinaCafe.getVasoCafe(vaso, 1, 3);

		assertEquals("No hay Azucar", resultado);
	}

	@Test
	public void RestCafe() {

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		maquinaCafe.getVasoCafe(vaso, 1, 3);

		int resultado = maquinaCafe.getCafetera().getCantidadCafe();

		assertEquals(40, resultado);
	}

	@Test
	public void RestVaso() {

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		maquinaCafe.getVasoCafe(vaso, 1, 3);

		int resultado = maquinaCafe.getVasoPequeño().getCantidadVaso();

		assertEquals(4, resultado);
	}

	@Test
	public void RestAzucar() {

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		maquinaCafe.getVasoCafe(vaso, 1, 3);
		int resultado = maquinaCafe.getAzucarero().getCantidadAzucar();

		assertEquals(17, resultado);
	}

	@Test
	public void Felicitaciones() {

		Vaso vaso = maquinaCafe.getTipoVaso("peque�o");

		String resultado = maquinaCafe.getVasoCafe(vaso, 1, 3);

		assertEquals("Felicitaciones", resultado);
	}

}