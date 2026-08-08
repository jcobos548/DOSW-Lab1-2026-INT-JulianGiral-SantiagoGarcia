package Laboratorio1.reto7;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class JuegoCalamar {

    public static void main(String[] args) {
        long premio = 150_000_000_000L;
        List<Jugador> jugadores = new ArrayList<>();

        jugadores.add(new Jugador(456, "Gi-hun", 160, 4));
        jugadores.add(new Jugador(67, "Sae-byeok", 80, 6));
        jugadores.add(new Jugador(218, "Cho Sang-woo", 250, 3));
        jugadores.add(new Jugador(199, "Ali Abdul", 70, 5));

        //PRUEBA 1

        System.out.println("Prueba 1 - Luz Roja Luz Verde:");

        List<Jugador> vivos = jugadores.stream()
                .filter(j -> j.getDeuda() <= 170)
                .collect(Collectors.toList());

        vivos.forEach(j ->
                System.out.println(j.getNombre() + " PASAN"));

        jugadores.stream()
                .filter(j -> j.getDeuda() > 170)
                .forEach(j ->
                        System.out.println("Jugador "
                                + j.getNumero()
                                + " ELIMINADO"));

        premio += 50_000_000L;

        //PRUEBA 2

        System.out.println("\nPrueba 2 - Los Dados:");

        Predicate<Jugador> dadoPar =
                j -> j.getDado() % 2 == 0;

        List<Jugador> vivosDados = vivos.stream()
                .filter(dadoPar)
                .collect(Collectors.toList());

        vivosDados.forEach(j ->
                System.out.println(j.getNombre()
                        + "(" + j.getDado() + ") PASAN"));

        vivos.stream()
                .filter(j -> j.getDado() % 2 != 0)
                .forEach(j ->
                        System.out.println("Jugador "
                                + j.getNumero()
                                + " ELIMINADO"));

        premio += 50_000_000L;

        //PRUEBA 3

        System.out.println("\nPrueba 3 - Puente de Cristal:");

        Predicate<Jugador> nombreValido =
                j -> j.getNombre().length() >= 5
                && j.getNombre().length() < 9;

        List<Jugador> ganadores = vivosDados.stream()
                .filter(nombreValido)
                .collect(Collectors.toList());

        ganadores.forEach(j ->
                System.out.println(j.getNombre() + " PASA"));

        vivosDados.stream()
                .filter(j -> !nombreValido.test(j))
                .forEach(j ->
                        System.out.println("Jugador "
                                + String.format("%03d", j.getNumero())
                                + " ELIMINADO"));

        //GANADOR

        if (!ganadores.isEmpty()) {

            long premioFinal = premio / ganadores.size();

            ganadores.forEach(j -> {
                System.out.println("\nJugador "
                        + j.getNumero()
                        + " Eres el Ganador!");
                System.out.println("Premio: "
                        + premioFinal
                        + " wones");
            });
        }
    }
}