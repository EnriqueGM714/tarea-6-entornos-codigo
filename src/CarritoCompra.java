/**
 * Clase que representa un carrito de la compra y permite calcular
 * el precio total aplicando descuentos en función del número de productos.
 *
 * Esta clase forma parte de un ejercicio de refactorización y documentación
 * con Javadoc.
 *
 * @author Enrique
 * @version 1.0
 */
public class CarritoCompra {

    /** Descuento fijo aplicado cuando se supera el límite de productos */
    private static final double DESCUENTO_CANTIDAD = 5.0;

    /** Porcentaje de descuento aplicado cuando hay productos */
    private static final double DESCUENTO_MAYOR = 0.8;

    /** Porcentaje de descuento aplicado cuando no hay productos */
    private static final double DESCUENTO_MENOR = 0.95;

    /** Número mínimo de productos para aplicar el descuento fijo */
    private static final int LIMITE_PRODUCTOS = 3;

    /**
     * Calcula el total a pagar aplicando descuentos según el número de productos
     * e imprime el resultado por pantalla.
     *
     * @param precioProducto precio base del producto
     * @param numProductos número de productos comprados
     */
    public void calcularTotal(double precioProducto, int numProductos) {
        double total;

        if (numProductos > LIMITE_PRODUCTOS) {
            precioProducto -= DESCUENTO_CANTIDAD;
        }

        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAYOR;
        } else {
            total = precioProducto * DESCUENTO_MENOR;
        }

        mostrarResultado(total);
    }

    /**
     * Muestra por consola el total a pagar y confirma el envío del pedido.
     *
     * @param total cantidad final que debe pagar el cliente
     */
    private void mostrarResultado(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}
