package com.paradigmas.unidad1.practico1.objects;

import java.util.ArrayList;

public class Usuario extends Cliente implements IAlquilar{

    private Integer numeroUsuario;
    private String nombreUsuario;


    public Usuario(Integer numeroDocumento, String nombre, String apellido, Integer numeroUsuario, String nombreUsuario) {
        super(numeroDocumento, nombre, apellido);
        this.numeroUsuario = numeroUsuario;
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public void alquilarPelicula(ArrayList<Pelicula> peliculas) {

    }

    @Override
    public void listarPeliculaAlquiladas() {

    }


}
