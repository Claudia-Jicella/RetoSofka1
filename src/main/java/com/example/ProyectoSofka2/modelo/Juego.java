package com.example.ProyectoSofka2.modelo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;

public class Juego {

    private int puntaje;
    private int ronda;
    private int rondaMaxima;
    private Jugador jugador;
    private boolean termina;

    private Juego (int rondaMaxima, Jugador jugador){
        this.puntaje= 0;
        this.ronda= 1;
        this.termina= false;
        this.rondaMaxima= rondaMaxima;
        this.jugador= jugador;
    }
    private void nivel1(int puntos){
        this.puntaje = puntaje+puntos;
        this.ronda = ronda+1;
        if(this.ronda> rondaMaxima) {
            this.termina= true;
        }

    }

    private void terminarJuego(boolean finaliza){
        this.termina= finaliza;
    }



}
