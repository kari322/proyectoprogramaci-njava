/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionjngrupo8;

import javax.swing.JOptionPane;

public class ProgramacionJnGrupo8 {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario(10);
        GestionClientes gestionClientes = new GestionClientes();
        GestionVentas gestionVentas = new GestionVentas(inventario, gestionClientes);
        
        int opcion = 0;

        while (opcion != 5) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENÚ PRINCIPAL\n"
                  + "1. Agregar producto\n"
                  + "2. Mostrar inventario\n"
                  + "3. Gestión de clientes\n"
                  + "4. Gestión de ventas\n"
                  + "5. Salir\n"
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
            if (opcion == 3) {
                gestionClientes.menuClientes();
            }

            if (opcion == 4) {
                gestionVentas.menuVentas();
            }
        }

        JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
    }
}