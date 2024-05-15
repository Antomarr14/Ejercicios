package EjerciciosExamen1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba el primer numero positivo :");
        int positivo = entrada.nextInt();

        int i = 1;
        while (i < positivo){
            System.out.println(i);
            i += 2;

        };
        System.out.println("¡Me enojo si no me pone 10!");
    }
}
