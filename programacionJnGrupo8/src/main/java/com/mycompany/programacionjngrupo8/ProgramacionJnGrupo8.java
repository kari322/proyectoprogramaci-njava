/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionjngrupo8;

import javax.swing.JOptionPane;

public class ProgramacionJnGrupo8 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(10);

        int opcion = 0;

        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENÚ DE INVENTARIO\n"
                  + "1. Agregar producto\n"
                  + "2. Mostrar inventario\n"
                  + "3. Salir\n"
                  + "Seleccione una opción:"
            ));

            if (opcion == 1) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("ID del producto:"));
                String nombre = JOptionPane.showInputDialog("Nombre:");
                double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio:"));
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad:"));

                Producto p = new Producto(id, nombre, precio, cantidad);
                inventario.agregarProducto(p);

                JOptionPane.showMessageDialog(null, "Producto agregado.");
            }

            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, inventario.mostrarInventario());
            }
        }

        JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
    }
}