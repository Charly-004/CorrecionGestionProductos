/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correciongestionproductos.controlador;

import correciongestionproductos.modelo.GestorProductos;
import correciongestionproductos.modelo.Producto;
import correciongestionproductos.vista.Listar;
import correciongestionproductos.vista.Vista;

/**
 *
 * @author papel
 */
public class Controlador {
    private Listar listar;
    private GestorProductos gestorProductos;
    private Vista vista;

    public Controlador(Listar listar, Vista vista) {
        this.gestorProductos = new GestorProductos();
        this.listar = listar;        
        this.vista = vista;
    }

    

    public void agregarProductos() {

        try {
            if (this.vista != null) {
                Producto objProductos = new Producto();
                objProductos.setNombre(this.vista.getNombre());
                objProductos.setPrecio(this.vista.getPrecio());
                objProductos.setEstado(this.vista.getDisponible());
                String msm = gestorProductos.agregarProductos(objProductos);
                vista.error(msm);

            } else {
                vista.error("Completa los datos!");
            }
        } catch (Exception e) {
            vista.error("Error controlado:" + e);
        }
    }

    public void listarProductos() {

        try {
            String msm = " ";
            Producto[] productos = new Producto[5];
            
            productos = gestorProductos.listarProductos();

            if (productos != null) {               
                String lista = "";
                for (int i = 0; i < productos.length; i++) {                    
                    if (productos[i] != null) {
                        String estado = productos[i].getEstado() ? "Disponible" : "No Disponible";
                        lista = lista + "id: " + productos[i].getId() + "\n"
                                + "Nombre: " + productos[i].getNombre() + "\n"
                                + "Precio: " + productos[i].getPrecio() + "\n"
                                + "Estado: " 
                                + estado+"\n\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listar.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listsrProductos: " + e);
        }
    }
}
