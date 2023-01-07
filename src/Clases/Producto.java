
package Clases;

public class Producto {
    //Atributos
    private final int idProducto; //final para que no se pueda modificar
    private String nombre;
    private double precio; 
    private static int contadorProductos;
    
    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        //inicializacion id
        this.idProducto = ++Producto.contadorProductos;
    }
    
    //Getter y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + 
                "idProducto=" + idProducto + 
                ", nombre=" + nombre + 
                ", precio=" + precio + '}';
    }
}
