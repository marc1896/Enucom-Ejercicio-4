package ejercicio4;

/*Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas 
caracterizados por su número de atleta, nombre y tiempo de carrera, 
al final el programa debe mostrar los datos del atleta ganador de la carrera.*/

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Se utiliza para leer los datos ingresados por el teclado
        Scanner sc = new Scanner(System.in);
        int numero, hora, minutos, segundos;
        String nombre;
        LocalTime tiempo;
        int numAtletas;
        System.out.println("Digite la cantidad de atletas: ");
        numAtletas = sc.nextInt();
        
        //Se crea el objeto para los coches
        Atleta atletas[] = new Atleta[numAtletas];
        
        for (int i = 0; i < atletas.length; i++) {
            sc.nextLine();
            System.out.println("Digite los datos del atleta " + (i + 1) + ":");
            System.out.println("Ingrese el Numero: ");
            numero = sc.nextInt();
            System.out.println("Ingrese el Nombre: ");
            nombre = sc.next();
            System.out.println("Ingrese el Tiempo: \n Ingrese la hora:");
            hora = sc.nextInt();
            System.out.println("Ingrese los minutos: ");
            minutos = sc.nextInt();
            System.out.println("Ingrese los segundos: ");
            segundos = sc.nextInt();
            tiempo = LocalTime.of(hora, minutos, segundos);
            
            
            atletas[i] = new Atleta(numero, nombre, tiempo);
        }
        int posMenor = obtenerTiempoMenor(atletas);
        System.out.println("El atleta con el tiempo menor es: \n" + atletas[posMenor].mostrarDatos());
    }
    
    /**
     * El siguiente metodo obtiene 
     * la posición del atleta con menor
     * tiempo 
     * @param atletas
     * @return 
     */
    public static int obtenerTiempoMenor(Atleta atletas[]){
        LocalTime tiempo;
        int posMenor = 0;
        
        tiempo = atletas[0].getTiempo();
        
        for (int i = 1; i < atletas.length; i++) {
            if (tiempo.isAfter(atletas[i].getTiempo())) {
                tiempo = atletas[i].getTiempo();
                posMenor = i;
            }
        }
        return posMenor;
    }
}
