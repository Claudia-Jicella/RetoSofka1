package com.example.ProyectoSofka2.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Preguntas")
public class Pregunta<respuesta> {

    @Id
    private String id;

    public String enunciado;
    public String a;
    public String b;
    public String c;
    public String d;

    public String respuesta;
    public int categoria;

    public Pregunta(String enunciado, String a, String b, String c, String d , String respuesta, int categoria){
        this.enunciado= enunciado;
        this.a= a;
        this.b= b;
        this.c= c;
        this.d= d;
        this.respuesta = respuesta;
        this.categoria = categoria;
    }
}
