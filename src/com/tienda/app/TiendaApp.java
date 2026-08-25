package com.tienda.app;

import com.tienda.model.Producto;
import java.util.ArrayList;

/**
 * Clase principal de la aplicación de administración de productos de una
 * tienda.
 */
public class TiendaApp {

    public static void main(String[] args) {
        // Crear tres productos
        Producto producto1 = new Producto("P001", "Laptop", 15000.00, 10);
        Producto producto2 = new Producto("P002", "Mouse", 350.00, 25);
        Producto producto3 = new Producto("P003", "Teclado", 850.00, 15);

        // Almacenarlos en un ArrayList
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        // Mostrar la información de cada producto
        System.out.println("=== Lista de Productos ===");
        System.out.println();

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
}