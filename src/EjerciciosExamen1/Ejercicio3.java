package EjerciciosExamen1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los puntos del cliente: ");
        int puntos = entrada.nextInt();

        String TipoCliente;
        if (puntos <1000) {
            TipoCliente = "Bronce";
        } else
            if (puntos < 3000){
                TipoCliente = "Plata";
            } else{
                TipoCliente = "Oro";
            }

        System.out.println("El cliente es: " + TipoCliente);

    }
}
