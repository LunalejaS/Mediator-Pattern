package mediator;

import colleague.Estudiante;
import model.Libro;

public interface Mediator {

    void solicitarPrestamo(Estudiante estudiante, Libro libro);

    void devolverLibro(Estudiante estudiante, Libro libro);
}