
package Test;

import Clases.Orden;
import Clases.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Banana", 23.5);
        Producto producto2 = new Producto("Manzana", 32.4);
        Producto producto3 = new Producto("Pera", 60);
        Producto producto4 = new Producto("Limon", 12.8);
        
        Orden orden1 = new Orden();
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        
        orden1.mostratOrder();
    }
}
