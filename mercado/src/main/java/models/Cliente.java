
package models;

import java.util.List;

public class Cliente {
    private String nombre;
    private List<Producto> productos;

    public Cliente(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public double calcularCostoTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public int calcularTiempoTotal() {
        return productos.stream().mapToInt(Producto::getTiempoEscaneo).sum();
    }
}
