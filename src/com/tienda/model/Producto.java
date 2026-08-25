package com.tienda.model;

/**
 * Representa un producto de la tienda.
 * Contiene la información básica de un producto: código, nombre, precio y
 * existencia.
 */
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int existencia;

    /**
     * Constructor de la clase Producto
     *
     * @param codigo     Código único del producto
     * @param nombre     Nombre del producto
     * @param precio     Precio del producto (debe ser positivo)
     * @param existencia Cantidad en existencia (debe ser positiva o cero)
     */
    public Producto(String codigo, String nombre, double precio, int existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setExistencia(existencia);
    }

    // Getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }

    // Setters

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el precio del producto.
     * Solo acepta valores positivos.
     *
     * @param precio Precio a establecer
     */
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio debe ser positivo.");
            this.precio = 0;
        }
    }

    /**
     * Establece la existencia del producto.
     * Solo acepta valores mayores o iguales a cero.
     *
     * @param existencia Cantidad a establecer
     */
    public void setExistencia(int existencia) {
        if (existencia >= 0) {
            this.existencia = existencia;
        } else {
            System.out.println("Error: La existencia no puede ser negativa.");
            this.existencia = 0;
        }
    }

    /**
     * Muestra la información completa del producto en consola.
     */
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.println("Existencia: " + existencia);
        System.out.println();
    }
}