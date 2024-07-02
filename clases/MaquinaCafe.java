
public class MaquinaCafe {

	public Vaso vasosPequeño;
	public Vaso vasosMediano;
	public Vaso vasosGrande;
	public Azucarero azucarero;
	public Cafetera cafetera1;

	public void setCafetera(Cafetera cafetero) {
		// TODO Auto-generated method stub
		this.cafetera1 = cafetero;
	}

	public void setVasosPequeños(Vaso vasoPequeño) {
		// TODO Auto-generated method stub
		this.vasosPequeño = vasoPequeño;

	}

	public void setVasosMediano(Vaso vasoMediano) {
		// TODO Auto-generated method stub
		this.vasosMediano = vasoMediano;
	}

	public void setVasosGrande(Vaso vasoGrande) {
		// TODO Auto-generated method stub
		this.vasosGrande = vasoGrande;
	}

	public void setAzucarero(Azucarero azucarero) {
		// TODO Auto-generated method stub
		this.azucarero = azucarero;

	}

	public Vaso getTipoVaso(String string) {
		// TODO Auto-generated method stub
		if (string == "peque�o") {
			return (Vaso) this.vasosPequeño;
		} else if (string == "mediano") {
			return (Vaso) this.vasosMediano;
		} else if (string == "grande") {
			return (Vaso) this.vasosGrande;
		}
		return null;

	}

	public String getVasoCafe(Vaso vaso, int i, int j) {
		// TODO Auto-generated method stub
		String respuesta = "Felicitaciones";
		if (this.vasosPequeño.cantidad < i) {
			respuesta = "No hay Vasos";
		} else if (this.vasosMediano.cantidad < i) {
			respuesta = "No hay Vasos";
		} else if (this.vasosGrande.cantidad < i) {
			respuesta = "No hay Vasos";
		} else {
			this.vasosPequeño.cantidad -= i;
			this.vasosMediano.cantidad -= i;
			this.vasosGrande.cantidad -= i;
			this.cafetera1.CantCafe -= (5 * 2);
			this.azucarero.cantazucar -= j;
			if (cafetera1.CantCafe <= 0) {
				respuesta = "No hay Cafe";
			} else if (azucarero.cantazucar <= 0) {
				respuesta = "No hay Azucar";
			}
		}
		return respuesta;
	}

	public Cafetera getCafetera() {
		// TODO Auto-generated method stub
		return this.cafetera1;
	}

	public Vaso getVasoPequeño() {

		// TODO Auto-generated method stub
		return this.vasosPequeño;
	}

	public Vaso getVasoMediano() {

		// TODO Auto-generated method stub
		return this.vasosMediano;
	}

	public Vaso getVasoGrande() {

		// TODO Auto-generated method stub
		return this.vasosPequeño;
	}

	public Azucarero getAzucarero() {
		return (Azucarero) this.azucarero;
	}

}
