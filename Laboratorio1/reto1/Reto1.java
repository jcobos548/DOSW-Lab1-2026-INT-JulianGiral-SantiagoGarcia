package Laboratorio1.reto1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reto1 {

    public static void main(String[] args) {

        List<Estudiante> studiousness = new ArrayList<>();

        studiousness.add(
                new Estudiante(
                        "Santiago Garcia",
                        6,
                        22,
                        "santiago.garcia-a@mail.escuelaing.edu.co"
                )
        );

        studiousness.add(
                new Estudiante(
                        "Julian Giral",
                        6,
                        20,
                        "julian.giral-c@mail.escuelaing.edu.co"
                )
        );

        MensajeBienvenida mensajeBienvenida =
                new MensajeBienvenida();

        mensajeBienvenida.generarMensaje(studiousness);
    }
}
