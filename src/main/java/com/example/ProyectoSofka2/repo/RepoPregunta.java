package com.example.ProyectoSofka2.repo;

import com.example.ProyectoSofka2.modelo.Pregunta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RepoPregunta extends MongoRepository <Pregunta,String> {

    List<Pregunta> findPreguntaByCategoria(int categoria); //QUERY metodo para filtar preguntas
}
