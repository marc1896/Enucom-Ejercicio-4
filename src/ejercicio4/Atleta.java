package ejercicio4;

import java.time.LocalTime;


public class Atleta {
    //Atributos
    private int numero;
    private String nombre;
    private LocalTime tiempo;

    //Constructores
    public Atleta() {}

    public Atleta(int numero, String nombre, LocalTime tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    //Metodos
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public String mostrarDatos() {
        return "Numero=" + numero + ", Nombre=" + nombre + ", Tiempo=" + tiempo;
    }
    
}
