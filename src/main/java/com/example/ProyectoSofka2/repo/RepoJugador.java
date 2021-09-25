package com.example.ProyectoSofka2.repo;

import com.example.ProyectoSofka2.modelo.Jugador;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoJugador extends MongoRepository<Jugador, String> {
}
