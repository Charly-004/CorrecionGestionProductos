/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correciongestionproductos.modelo;

/**
 *
 * @author carla
 */
public class GestorProductos {
    int tamanoVector = 5;
        Producto[] productos = new Producto[tamanoVector];
        int cont = 0;

        public String agregarProductos(Producto producto) {
            String msg = "Ingreso exitoso";
            if (productos.length != cont) {
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i] == null) {
                        //inicializar el objeto
                        productos[i] = new Producto();
                        productos[i].setId(i);
                        productos[i].setNombre(producto.getNombre());
                        productos[i].setPrecio(producto.getPrecio());
                        productos[i].setEstado(producto.getEstado());
                        cont++;
                        //con esto me aseguro que los datos solo se ingresen una vez en el vector. 
                        return msg;
                    }
                }
            } else {
                    msg = "Ingreso no permitido, el vector esta lleno";
            }
            return msg;
        }

        public Producto[] listarProductos() {

            Producto[] auxProductos = new Producto[tamanoVector];
            for (int i = 0; i < cont; i++) {
                auxProductos[i] = new Producto();           
                auxProductos[i].setId(productos[i].getId());
                auxProductos[i].setNombre(productos[i].getNombre());
                auxProductos[i].setPrecio(productos[i].getPrecio());
                auxProductos[i].setEstado(productos[i].getEstado());
                System.out.println("Modelo-listarProductos" + auxProductos[i].getEstado());
            }
            return auxProductos;
        }
}
