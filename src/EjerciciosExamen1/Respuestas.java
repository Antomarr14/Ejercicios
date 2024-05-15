package EjerciciosExamen1;

import java.util.Scanner;

public class Respuestas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de respuestas correctas: ");
        int correctas = entrada.nextInt();
        System.out.println("Ingrese el numero de respuestas incorrectas: ");
        int incorrectas = entrada.nextInt();
        System.out.println("Escriba el numero de respuestas vacias: ");
        int vacias = entrada.nextInt();

        int puntuaje = correctas * 5 - incorrectas *2;
        System.out.println("El puntuaje es: " + puntuaje);

    }
}
