public class Azucarero {

    public int cantazucar;

    public Azucarero(int cantazucar) {
        this.cantazucar = cantazucar; // Inicializa correctamente cantazucar
    }

    public boolean hasAzucar(int i) {
        return cantazucar >= i; // Devuelve true si hay suficiente azúcar
    }

    public void giveAzucar(int i) {
        if (hasAzucar(i)) {
            cantazucar -= i;
        } 
    }

    public int getCantidadAzucar() {
        return cantazucar;
    }

    public boolean hasAzucar() {
        return cantazucar >= 1; // Verifica si hay al menos 1 unidad de azúcar
    }
}
