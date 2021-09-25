package com.example.ProyectoSofka2.repo;

import com.example.ProyectoSofka2.modelo.Moto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoMoto extends MongoRepository<Moto, String> {
}
