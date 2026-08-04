package Laboratorio1.reto1;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MensajeBienvenida {

    public void generarMensaje(List<Estudiante> estudiantes) {

        List<String> nombres = estudiantes.stream()
                .map(Estudiante::getNombre)
                .collect(Collectors.toList());

        List<String> correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.toList());

        String mensaje =
                "¡Hola, bienvenidos! Somos la pareja conformada por "
                        + nombres.get(0)
                        + ", estudiante de "
                        + estudiantes.get(0).getSemestre()
                        + "° semestre de "
                        + estudiantes.get(0).getEdad()
                        + " años, y "
                        + nombres.get(1)
                        + ", estudiante de "
                        + estudiantes.get(1).getSemestre()
                        + "° semestre de "
                        + estudiantes.get(1).getEdad()
                        + " años. Nuestros correos son: "
                        + correos.get(0)
                        + " y "
                        + correos.get(1);

        Consumer<String> imprimir =
                texto -> System.out.println(texto);

        imprimir.accept(mensaje);
    }
}