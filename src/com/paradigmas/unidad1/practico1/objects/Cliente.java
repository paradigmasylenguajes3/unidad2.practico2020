package com.paradigmas.unidad1.practico1.objects;

public class Cliente {

     private Integer numeroDocumento;
     private String nombre;
     private String apellido;


    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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

    public void comprar(){

    }

    public void devolverCatalogo(){

    }

    public Cliente() {
    }

    public Cliente(Integer numeroDocumento, String nombre, String apellido) {
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
}
