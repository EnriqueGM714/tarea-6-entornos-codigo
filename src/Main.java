/**
 * Clase principal que contiene el método main.
 * Se utiliza para probar el funcionamiento de la clase CarritoCompra.
 *
 * @author Enrique
 * @version 1.0
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * Crea un carrito de compra y ejecuta el cálculo del total.
     *
     * @param args argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        CarritoCompra miCarrito = new CarritoCompra();
        miCarrito.calcularTotal(100, 5);
    }
}