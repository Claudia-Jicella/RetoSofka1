package com.example.ProyectoSofka2;

import com.example.ProyectoSofka2.modelo.Jugador;
import com.example.ProyectoSofka2.modelo.Moto;
import com.example.ProyectoSofka2.repo.RepoJugador;
import com.example.ProyectoSofka2.repo.RepoMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectoSofka2Application implements CommandLineRunner {

	@Autowired
	RepoMoto repoMoto;
	@Autowired
	RepoJugador repoJugador;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSofka2Application.class,args);
	}




	@Override
	public void run (String... args) throws Exception {

		System.out.println("Hola Claudia");
		Moto miMoto = new Moto(" Auteco", " Negra");
		repoMoto.save(miMoto);

		System.out.println("jugador Uno");
		Jugador jugadorUno= new Jugador("Juan ", 0);
		repoJugador.save(jugadorUno);


	}




}
