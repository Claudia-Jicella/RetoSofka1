package com.example.ProyectoSofka2.repo;

import com.example.ProyectoSofka2.modelo.Pregunta;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoPregunta extends MongoRepository <Pregunta,String> {
}
