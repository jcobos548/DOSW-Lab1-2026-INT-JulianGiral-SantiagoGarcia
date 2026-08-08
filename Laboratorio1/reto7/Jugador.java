package Laboratorio1.reto7;
public class Jugador {

    private final int numero;
    private final String nombre;
    private final long deuda;
    private final int dado;

    public Jugador(int numero, String nombre, long deuda, int dado) {
        this.numero = numero;
        this.nombre = nombre;
        this.deuda = deuda;
        this.dado = dado;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDeuda() {
        return deuda;
    }

    public int getDado() {
        return dado;
    }
}