/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class ListaProducto implements Serializable{
    private List<Producto> productos;

    //Contructor sin parametro
    public ListaProducto() {
        productos = new ArrayList <Producto>();
    }

    
   //Agrega un nuevo producto
    public void agregarProductos(Producto producto){
    productos.add(producto);
    }
    
    
    
    
    //Getter and Setter
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
  
    
}
