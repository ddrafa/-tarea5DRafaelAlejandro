/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

/**
 *
 * @author ddrafa
 */
public record Producto(String nombre, double precio, TAM tamProducto) {

    public Producto(String nombre, double precio, TAM tamProducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamProducto = tamProducto;
    }

    public Producto ProductoDefecto() {
        return new Producto("", 0, TAM.PEQUENO);
    }
}
