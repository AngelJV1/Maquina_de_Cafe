
public class Cafetera {
	public int CantCafe=0;

	public Cafetera(int i) {
		// TODO Auto-generated constructor stub
		this.CantCafe=i;
	}


	public boolean hasCafe(int i) {
		// TODO Auto-generated method stub
		boolean respuesta=true;
		if(CantCafe<i) {
			respuesta=false;
		}
		return respuesta;
	}

	public void giveCafe(int i) {
		// TODO Auto-generated method stub
		if (hasCafe(i)) {
            CantCafe -= i;
        } 
	}

	public int getCantidadCafe() {
		// TODO Auto-generated method stub
		return CantCafe;
	}

}
