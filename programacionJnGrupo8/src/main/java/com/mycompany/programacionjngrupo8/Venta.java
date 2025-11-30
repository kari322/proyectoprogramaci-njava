/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionjngrupo8;

/**
 *
 * @author karin
 */
public class Venta {
    int idVenta;
    Cliente cliente;
    Producto producto;
    int cantidad;
    double total;

    public Venta(int idVenta, Cliente cliente, Producto producto, int cantidad) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = cantidad * producto.precio;
    }

    public String mostrarVenta() {
        return "Venta #" + idVenta +
               "\nCliente: " + cliente.nombre +
               "\nProducto: " + producto.nombre +
               "\nCantidad: " + cantidad +
               "\nTotal: ₡" + String.format("%,.2f", total);
    }
}