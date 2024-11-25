/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mercado;
import java.util.Arrays;
import models.Cajera;
import models.Cliente;
import models.Producto;

public class Mercado {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Arroz", 2000, 1);
        Producto p2 = new Producto("Frijoles", 1500, 1);
        Producto p3 = new Producto("Leche", 3000, 1);
        Producto p4 = new Producto("Cereal", 4000, 1);
        Producto p5 = new Producto("Huevos", 2500, 1);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", Arrays.asList(p1, p2, p3));
        Cliente cliente2 = new Cliente("María", Arrays.asList(p4, p5));
        Cliente cliente3 = new Cliente("Carlos", Arrays.asList(p1, p4, p5));
        Cliente cliente4 = new Cliente("Ana", Arrays.asList(p3, p2));

        // Crear cajeras
        Cajera cajera1 = new Cajera("Ana");
        Cajera cajera2 = new Cajera("Lucía");

        // Registrar tiempo inicial
        long tiempoInicio = System.currentTimeMillis();

        // Procesar clientes secuencialmente
        System.out.println("=== Inicio del proceso de cobro ===\n");
        System.out.println("Cajera Ana atendiendo clientes:");
        cajera1.procesarClientes(Arrays.asList(cliente1, cliente2));

        System.out.println("Cajera Lucía atendiendo clientes:");
        cajera2.procesarClientes(Arrays.asList(cliente3, cliente4));

        // Registrar tiempo final y mostrar resultados
        long tiempoTotal = System.currentTimeMillis() - tiempoInicio;
        System.out.println("Tiempo total para procesar todas las compras: " + tiempoTotal + "ms");
    }
}
