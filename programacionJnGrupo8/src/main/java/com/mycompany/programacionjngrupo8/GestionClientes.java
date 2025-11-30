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
public class GestionClientes {
    
    private String[] clientes = new String[20];
    private int contador = 0;

    public void menuClientes() {

        int opcion = 0;

        while (opcion != 4) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "GESTIÓN DE CLIENTES\n"
                  + "1. Registrar cliente\n"
                  + "2. Mostrar clientes\n"
                  + "3. Buscar cliente\n"
                  + "4. Salir\n"
                  + "Seleccione una opción:"
            ));

            if (opcion == 1) registrarCliente();
            if (opcion == 2) mostrarClientes();
            if (opcion == 3) buscarCliente();
        }
    }

    private void registrarCliente() {

        if (contador >= 20) {
            JOptionPane.showMessageDialog(null, "Límite de clientes alcanzado.");
            return;
        }

        String cedula = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
        String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del cliente:");

        clientes[contador] = "Cédula: " + cedula 
                           + " | Nombre: " + nombre 
                           + " | Teléfono: " + telefono;

        contador++;

        JOptionPane.showMessageDialog(null, "Cliente registrado.");
    }

    private void mostrarClientes() {

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
            return;
        }

        String lista = "=== CLIENTES REGISTRADOS ===\n\n";

        for (int i = 0; i < contador; i++) {
            lista += clientes[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, lista);
    }

    private void buscarCliente() {

        String cedulaBuscar = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");

        for (int i = 0; i < contador; i++) {

            if (clientes[i].contains(cedulaBuscar)) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado:\n" + clientes[i]);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
    }
}