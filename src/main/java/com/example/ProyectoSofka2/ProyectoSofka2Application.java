package com.example.ProyectoSofka2;

import com.example.ProyectoSofka2.modelo.Juego;
import com.example.ProyectoSofka2.modelo.Jugador;
import com.example.ProyectoSofka2.modelo.Pregunta;
import com.example.ProyectoSofka2.repo.RepoJugador;
import com.example.ProyectoSofka2.repo.RepoPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class ProyectoSofka2Application implements CommandLineRunner {

	@Autowired
	RepoJugador repoJugador;
	@Autowired
	RepoPregunta repoPregunta;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSofka2Application.class,args);
	}

	@Override
	public void run (String... args) throws Exception {

		Thread.sleep(4000);
		System.out.println( "*****BIENVENIDO AL JUEGO DE PREGUNTAS*****");
		System.out.println("Seleccione 1 para jugar");

		Scanner leer = new Scanner(System.in);
		int jugar = Integer.parseInt(leer.nextLine());

		if(jugar == 1){
			System.out.println("Cual es tu nombre? :");
			String nombre = leer.nextLine();
			Jugador jugador1= new Jugador(nombre, 0);
			System.out.println("Bienvenid@ " + jugador1.nombre);

			while (jugar ==1 ) {

				Juego juego = new Juego(jugador1);

				while (juego.ronda <= 5) {

					System.out.println("Categoria "+ juego.ronda );
					System.out.println("SI DESEA RETIRARSE PRESIONE R");

					List<Pregunta> listaPreguntas = repoPregunta.findPreguntaByCategoria(juego.ronda);
					int numAleatorio = (int) (Math.random() * 5);
					Pregunta pregunta = listaPreguntas.get(numAleatorio);
					System.out.println(pregunta.enunciado);
					System.out.println(pregunta.a);
					System.out.println(pregunta.b);
					System.out.println(pregunta.c);
					System.out.println(pregunta.d);
					String opcion = leer.nextLine().toUpperCase();

					// opcion == pregunta.respuesta
					if (opcion.equals(pregunta.respuesta)) {
						System.out.println("Muy bien");
						juego.sumarPuntos(20);
					}else if(opcion.equals("R")){
						System.out.println("Has finalizado el juego, tus puntos son: "+juego.puntaje);
						break;
					} else {
						System.out.println("Respuesta incorrecta");
						juego.puntaje = 0;
						break;
					}
				}

				jugador1.agregarPuntos(juego.puntaje);
				repoJugador.save(jugador1);

				System.out.println("Deseas volver a intentarlo?");
				System.out.println("1 para si // 0 para No");
				jugar = Integer.parseInt(leer.nextLine());
			}
		}

		/*int n = 1;
		Scanner leer = new Scanner(System.in);

		while (n<25) {
			System.out.println("NUEVA PREGUNTA");
			System.out.println("enunciado");
			String enunciado = leer.nextLine();

			System.out.println("opcion a");
			String a = leer.nextLine();
			System.out.println("opcion b");
			String b = leer.nextLine();
			System.out.println("opcion c");
			String c = leer.nextLine();
			System.out.println("opcion d");
			String d = leer.nextLine();

			System.out.println("respuesta verdadera (letra)");
			String res = leer.nextLine();

			System.out.println("categoria");
			int categoria = Integer.parseInt(leer.nextLine());

			Pregunta nuevaPregunta = new Pregunta(enunciado,a,b, c,d,res, categoria );

			repoPregunta.save(nuevaPregunta);
			n= n+1;
		}*/
	}
}
