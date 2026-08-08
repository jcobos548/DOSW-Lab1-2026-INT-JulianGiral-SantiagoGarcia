package Laboratorio1.reto6;

import java.util.HashMap;
import java.util.Map;

public class MaquinaDecisiones {

    static Map<String, Runnable> comandos = new HashMap<>();

    public static void main(String[] args) {

        comandos.put("SALUDAR", () -> ejecutarFragmentoA("SALUDAR"));
        comandos.put("DESPEDIR", () -> ejecutarFragmentoA("DESPEDIR"));
        comandos.put("CANTAR", () -> ejecutarFragmentoA("CANTAR"));
        comandos.put("DANZAR", () -> ejecutarFragmentoA("DANZAR"));

        comandos.put("BROMEAR", () -> ejecutarFragmentoB("BROMEAR"));
        comandos.put("GRITAR", () -> ejecutarFragmentoB("GRITAR"));
        comandos.put("SUSURRAR", () -> ejecutarFragmentoB("SUSURRAR"));
        comandos.put("ANALIZAR", () -> ejecutarFragmentoB("ANALIZAR"));

        // Pruebas Estudiante A
        ejecutarComando("SALUDAR");
        ejecutarComando("BROMEAR");
        ejecutarComando("ANALIZAR");
        ejecutarComando("DANZAR");
        // Pruebas Estudiante B
        ejecutarComando("BROMEAR");
        ejecutarComando("GRITAR");
        ejecutarComando("SUSURRAR");
        ejecutarComando("ANALIZAR");
    }

    public static void ejecutarFragmentoA(String comando) {
        switch (comando) {
            case "SALUDAR" -> System.out.println("¡Saludos, viajero del Tiempo y del código!");
            case "DESPEDIR" -> System.out.println("Hasta pronto.");
            case "CANTAR" -> System.out.println("♪ Cantando una melodía digital ♪");
            case "DANZAR" -> System.out.println("Girando en modo fiesta.");
        }
    }
    
    public static void ejecutarFragmentoB(String comando) {
        switch (comando) {
            case "BROMEAR" -> {
                System.out.println("¿Por qué la RAM rompió con la CPU?");
                System.out.println("Porque necesitaba espacio.");
            }
            case "GRITAR" -> System.out.println("¡¡¡ATENCIÓN!!!");
            case "SUSURRAR" -> System.out.println("(voz baja) secreto...");
            case "ANALIZAR" -> System.out.println("Analizando datos... ¡Eres increíble!");
        }
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);

        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no válido.");
        }
    }
}