/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Masterzhord
 */
public class Producto implements Serializable{
 private int id;
 private String nombre;
 private int cantidad;
 private String marca;
 private String talle;
 private String color;
 private String origen;
 private float precio;

 // Contructor Vacio
 
    public Producto() {
    }
 // Contructor con parametros 
    
    public Producto(int id, String nombre, int cantidad, String marca, String talle, String color, String origen, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.talle = talle;
        this.color = color;
        this.origen = origen;
        this.precio = precio;
    }

    
    //Getter and Setter
    
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
 
 
}
