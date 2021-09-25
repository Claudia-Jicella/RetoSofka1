package com.example.ProyectoSofka2.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Motos")
public class Moto {

    @Id
    private String id;

    private String marca;
    private String color;
    private int modelo;

    public Moto (String marca,String color ){

        this.marca= marca;
        this.color= color;
        this.modelo= 2012;

    }

    public void  mostrarMoto (){

        System.out.println("Marca de la Moto= " + marca + "\nColor de la Moto= " + color + "\nModelo de la Moto= " + modelo );

    }
}


