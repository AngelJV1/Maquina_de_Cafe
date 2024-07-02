public class Vaso {
    public int capacidad;
    public int cantidad;

    public Vaso(int cantidad, int capacidad) {
        this.capacidad = capacidad;
        this.cantidad = cantidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCantidadVaso() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean hasVasos(int cantidadSolicitada) {
    	boolean respuesta=true;
        if(cantidad < cantidadSolicitada) {
           respuesta = false;	
        }
        return respuesta;
    }
    public void giveVasos(int i) {
    	if (hasVasos(i)) {
            cantidad -= i;
        } 
    }
}
