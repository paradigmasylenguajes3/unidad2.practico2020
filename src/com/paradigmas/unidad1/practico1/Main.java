package com.paradigmas.unidad1.practico1;

import com.paradigmas.unidad1.practico1.objects.Cliente;
import com.paradigmas.unidad1.practico1.objects.Usuario;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Como declaro un objeto de la clase Cliente
        Cliente cliente;
        Usuario usuario;

        //instanciar objetos // instanciar objeto con valores
         cliente = new Cliente();

         cliente.setNombre("Leonel");
         cliente.setApellido("Vargas");

        //quiero imprimir todos los atributos del objeto
        System.out.println(cliente);



    }
}
