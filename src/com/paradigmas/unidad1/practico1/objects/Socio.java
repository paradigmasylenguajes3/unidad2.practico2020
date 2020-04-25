package com.paradigmas.unidad1.practico1.objects;

import java.util.ArrayList;

public class Socio extends Cliente implements IAlquilar{
    private Integer numeroSocio;

    //cuando tengo relaciones de 1 a muchos
    //private ArrayList<Tarjeta> tarjetas;

    //cuando tengo relaciones de uno a uno
    //cuando tenemos una asociacion simple

    private Tarjeta tarjeta;

    public void alquilar(){}

    @Override
    public void alquilarPelicula(ArrayList<Pelicula> peliculas) {

    }

    @Override
    public void listarPeliculaAlquiladas() {

    }
}
