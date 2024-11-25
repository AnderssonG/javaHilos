
package models;


import java.util.List;

public class Cajera {
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public void procesarClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            procesarCompra(cliente);
        }
    }

    private void procesarCompra(Cliente cliente) {
        System.out.println("La cajera " + nombre + " comienza a atender a " + cliente.getNombre());
        

        for (Producto producto : cliente.getProductos()) {
            System.out.println("Procesando: " + producto);
            
        }

        System.out.println("Compra de " + cliente.getNombre() + " finalizada por " + nombre +
                ". Total: $" + cliente.calcularCostoTotal());
    }
}
