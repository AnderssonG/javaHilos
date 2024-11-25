
package models;

import java.util.List;

public class Cajera implements Runnable {
    private String nombre;
    private List<Cliente> clientes;

    public Cajera(String nombre, List<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    private void procesarCompra(Cliente cliente) {
        System.out.println("La cajera " + nombre + " comienza con " + cliente.getNombre());
        int tiempoTotal = 0;

        for (Producto producto : cliente.getProductos()) {
            try {
                System.out.println("Procesando: " + producto);
                Thread.sleep(producto.getTiempoEscaneo());
                tiempoTotal += producto.getTiempoEscaneo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Compra de " + cliente.getNombre() + " finalizada por " + nombre +
                ". Total: $" + cliente.calcularCostoTotal() +
                ", Tiempo: " + tiempoTotal + "ms\n");
    }

    @Override
    public void run() {
        for (Cliente cliente : clientes) {
            procesarCompra(cliente);
        }
    }
}
