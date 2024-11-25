
package models;

public class Producto {
    private String nombre;
    private double precio;
    private int Cantidad; // Tiempo en milisegundos

    public Producto(String nombre, double precio, int Cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoEscaneo() {
        return Cantidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: $" + precio + ", Tiempo: " + Cantidad ;
    }
}
