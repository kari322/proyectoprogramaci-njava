/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionjngrupo8;

/**
 *
 * @author karin
 */
public class Cliente {
    int idCliente;
    String nombre;
    String telefono;

    public Cliente(int idCliente, String nombre, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String mostrarCliente() {
        return "ID Cliente: " + idCliente +
               " | Nombre: " + nombre +
               " | Teléfono: " + telefono;
    }
}