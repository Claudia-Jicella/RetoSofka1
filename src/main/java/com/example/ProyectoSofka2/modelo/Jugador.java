package com.example.ProyectoSofka2.modelo;

import org.springframework.data.annotation.Id;

public class Jugador {

    @Id
    private String id;

    private String nombre;
    private int puntos;

    public Jugador (String nombre, int puntos){

        this.nombre= nombre;
        this.puntos= puntos;
    }

    public void agregarPuntos(int score){
        this.puntos = puntos + (score*20);

        System.out.println("Nombre Del Jugador= " + nombre + "\nNumero De Puntos= " + puntos);
    }

}
