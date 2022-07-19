package edu.coderhouse.Jpaproyect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @Column(name="IDPRODUCTO")
    private Integer idproducto;
    @Column(name="DESCRIPCION")
    private String descripcion;
    @Column(name="PRECIO")
    private Float precio;
    @Column(name="STOCK")
    private Integer stock;

    //********************
    //********CONSTRUCTOR*
    //********************


    public Producto() {
    }

    public Producto(Integer idproducto, String descripcion, Float precio, Integer stock) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    //********************
    //****GET AND SETT****
    //********************


    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
