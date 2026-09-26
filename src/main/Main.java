package main;

import colleague.Estudiante;
import mediator.BibliotecaMediator;
import mediator.Mediator;
import model.Libro;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new BibliotecaMediator();

        Estudiante ana = new Estudiante("Ana", mediator);
        Estudiante carlos = new Estudiante("Carlos", mediator);

        Libro libro = new Libro("Patrones de Diseño");

        ana.solicitarLibro(libro);
        carlos.solicitarLibro(libro);
        ana.devolverLibro(libro);
        carlos.solicitarLibro(libro);
    }
}