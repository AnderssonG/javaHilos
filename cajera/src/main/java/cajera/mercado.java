/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cajera;

import java.util.Arrays;
import java.util.List;
import models.*;

public class mercado {
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
        Cajera cajera1 = new Cajera("Ana", Arrays.asList(cliente1, cliente2));
        Cajera cajera2 = new Cajera("Lucía", Arrays.asList(cliente3, cliente4));

        // Crear hilos
        Thread hilo1 = new Thread(cajera1);
        Thread hilo2 = new Thread(cajera2);

        // Registrar tiempo inicial
        long tiempoInicio = System.currentTimeMillis();

        // Iniciar hilos
        hilo1.start();
        hilo2.start();

        // Esperar a que los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registrar tiempo final y mostrar resultados
        long tiempoTotal = System.currentTimeMillis() - tiempoInicio;
        System.out.println("Tiempo total para procesar todas las compras: " + tiempoTotal + "ms");
    }
}
