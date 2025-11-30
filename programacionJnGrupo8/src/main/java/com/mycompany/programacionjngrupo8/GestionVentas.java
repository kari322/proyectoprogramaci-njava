/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionjngrupo8;

import javax.swing.JOptionPane;

/**
 *
 * @author karin
 */
public class GestionVentas {
    
    private Inventario inventario;
    private GestionClientes clientes;
    private String historial = "";

    public GestionVentas(Inventario inventario, GestionClientes clientes) {
        this.inventario = inventario;
        this.clientes = clientes;
    }

    public void menuVentas() {

        int opcion = 0;

        while (opcion != 3) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENÚ VENTAS\n"
                    + "1. Registrar venta\n"
                    + "2. Mostrar historial\n"
                    + "3. Volver"
            ));

            if (opcion == 1) registrarVenta();
            if (opcion == 2) mostrarHistorial();
        }
    }

    private void registrarVenta() {

        int id = Integer.parseInt(JOptionPane.showInputDialog("ID del producto:"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad vendida:"));

        Producto p = inventario.buscarProducto(id);

        if (p == null) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.");
            return;
        }

        if (cantidad > p.cantidad) {
            JOptionPane.showMessageDialog(null, "Stock insuficiente.");
            return;
        }

        // Actualizar stock
        p.cantidad -= cantidad;

        double total = cantidad * p.precio;

        historial += "Venta: " + p.nombre + " x" + cantidad + " → ₡" + total + "\n";

        JOptionPane.showMessageDialog(null, "Venta realizada.");
    }

    private void mostrarHistorial() {

        if (historial.length() == 0) {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas.");
        } else {
            JOptionPane.showMessageDialog(null, historial);
        }
    }
}