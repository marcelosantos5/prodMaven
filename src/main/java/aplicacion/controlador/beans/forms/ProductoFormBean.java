/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.forms;

import aplicacion.interfaces.dao.IProductoDAO;
import aplicacion.interfaces.dao.imp.ProductoListDAOImp;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Masterzhord
 */
public class ProductoFormBean implements Serializable{
    private Producto producto;
    private List<Producto> productos;
    private IProductoDAO productoDAO;

    //Contructor Vacio
    public ProductoFormBean() {
        productoDAO = (IProductoDAO) new ProductoListDAOImp();
        
    }

    public void guardadproducto (){
    productoDAO.crearProducto(producto);
    
    }
    
    
    
    //Getter and Setter
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
