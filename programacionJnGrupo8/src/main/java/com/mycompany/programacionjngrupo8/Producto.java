/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionjngrupo8;

/**
 *
 * @author pablo
 */
public class Producto {
    int idProducto;
    String nombre;
    double precio;
    int cantidad;

    public Producto(int idProducto, String nombre, double precio, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String mostrarProducto() {
        return "ID: " + idProducto +
               " | Nombre: " + nombre +
               " | Precio: " + precio +
               " | Cantidad: " + cantidad;
    }
}
