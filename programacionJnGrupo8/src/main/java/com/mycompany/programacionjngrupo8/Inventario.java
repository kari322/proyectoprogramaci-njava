/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionjngrupo8;

/**
 *
 * @author pablo
 */
public class Inventario {
    Producto[] productos;
    int contador;

    public Inventario(int tamaño) {
        productos = new Producto[tamaño];
        contador = 0;
    }

    public void agregarProducto(Producto p) {
        productos[contador] = p;
        contador++;
    }

    public String mostrarInventario() {
        String texto = "=== Inventario ===\n";
        for (int i = 0; i < contador; i++) {
            texto += productos[i].mostrarProducto() + "\n";
        }
        return texto;
    }
    
    public Producto buscarProducto(int id) {
    for (int i = 0; i < contador; i++) {
        if (productos[i].idProducto == id) {
            return productos[i];
        }
    }
    return null;
    }
}
