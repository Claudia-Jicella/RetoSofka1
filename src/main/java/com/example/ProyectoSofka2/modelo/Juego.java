package com.example.ProyectoSofka2.modelo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;

public class Juego {

    public int puntaje;
    public int ronda;
    public Jugador jugador;
    public boolean terminado;

    public Juego ( Jugador jugador){
        this.puntaje= 0;
        this.ronda= 1;
        this.terminado= false;
        this.jugador= jugador;
    }
    public void sumarPuntos(int puntos){
        this.puntaje = puntaje+puntos;
        this.ronda = ronda+1;

    }



}
