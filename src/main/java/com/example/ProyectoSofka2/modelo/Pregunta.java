package com.example.ProyectoSofka2.modelo;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Pregunta<respuesta> {

    @Id
    private String id;

    private String enunciado;
    private List<String> opciones;
    private String respuesta;
    private int categoria;

    private Pregunta(String enunciado, List<String> opciones, String respuesta, int categoria){
        this.enunciado= enunciado;
        this.opciones = opciones;
        this.respuesta = respuesta;
        this.categoria = categoria;

    }


}
