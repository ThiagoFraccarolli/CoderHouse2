package edu.coderhouse.Jpaproyect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;;
import java.util.Date;

@Entity
@Table(name ="COMPROBANTE")
public class Comprobante {

    @Id
    @Column(name ="IDCOMPROBANTE")
    private Integer idcomprobante;

    @Column(name = "IDCLIENTE")
    private Integer idcliente;

    @Column(name = "CANTIDAD")
    private Integer cantidad;

    @Column(name = "FECHA")
    private Date fecha;

    @Column(name = "TOTAL")
    private Integer total;

    //********************
    //********CONSTRUCTOR*
    //********************


    public Comprobante() {
    }

    public Comprobante(Integer idcomprobante, Integer idcliente, Integer cantidad, Date fecha, Integer total) {
        this.idcomprobante = idcomprobante;
        this.idcliente = idcliente;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.total = total;
    }

    //********************
    //****GET AND SETT****
    //********************


    public Integer getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(Integer idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getIdcliente() {return idcliente;}

    public void setIdcliente(Integer idcliente) {this.idcliente = idcliente;}
}
