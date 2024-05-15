package EjerciciosExamen1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] Mascotas = new String[10];
        System.out.println("Vamos a al nombre de las mascotas: ");
        for(int i = 0; i <= 9; i++){
            System.out.println("Escriba el nombre de su mascota [" + i +"]");
            Mascotas[i] = entrada.next();
        }
        System.out.println();
        System.out.println("El contenido de la matriz es: ");
        for(int i = 0; i <= 9; i+=2){
            System.out.print("elemento[" +i+"]: " + Mascotas[i] + ", ");
        }

    }
}
