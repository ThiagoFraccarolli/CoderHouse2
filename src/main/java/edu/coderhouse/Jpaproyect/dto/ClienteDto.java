package edu.coderhouse.Jpaproyect.dto;

public class ClienteDto {

    private int  idcliente;
    private int dni;
    private String nombre ;
    private String apellido;
    private int edad;

    public ClienteDto(int idcliente, int dni, String nombre, String apellido, int edad) {
        this.idcliente = idcliente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {this.edad = edad;}

    public int getIdcliente() {return idcliente;}

    public void setIdcliente(int idcliente) {this.idcliente = idcliente;}
}
