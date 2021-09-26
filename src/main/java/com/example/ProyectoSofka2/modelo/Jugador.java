package com.example.ProyectoSofka2.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "jugadores")
public class Jugador {

    @Id
    public String id;

    public String nombre;
    public int puntos;

    public Jugador (String nombre, int puntos){

        this.nombre= nombre;
        this.puntos= puntos;
    }

    public void agregarPuntos(int puntosGanados){
        this.puntos = puntos + puntosGanados;

        System.out.println("Nombre Del Jugador= " + nombre + "\nNumero De Puntos= " + puntos);
    }

}
