package Clases;

public class Orden {

    //Atributos
    private final int idOrden;
    private Producto productos[];
    private int contadorProductos;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;

    //Constructor
    public Orden() {
        //inicializacion de datos
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    //Metodos
    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[contadorProductos++] = producto;
        } else {
            System.out.println("Se supero el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        
        return total;
    }
    
    public void mostratOrder(){
        System.out.println("idOrden: " + this.idOrden);
        System.out.println("\nTotal orden: $" + this.calcularTotal());
        System.out.println("\nProductos: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i].toString());
        }
    }
    
}
