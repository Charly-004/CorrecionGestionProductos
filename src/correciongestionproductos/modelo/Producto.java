/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correciongestionproductos.modelo;

/**
 *
 * @author papel
 */
public class Producto {
    private int id;
    private String nombre;
    private String precio;
    private boolean disponible;


    public Producto(int id, String nombre, String precio, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = estado;
    }

    public Producto() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean getEstado() {
        return disponible;
    }

    public void setEstado(boolean disponible) {
        this.disponible = disponible;
    }
}
