import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        String torta, cliente;
        int cantidad_tortas, ventas, pedido, numeroAleatorio, opcion;

        numeroAleatorio = rand.nextInt(71);
        ventas=numeroAleatorio;
        numeroAleatorio = rand.nextInt(51)+50;
        cantidad_tortas=numeroAleatorio;
        cantidad_tortas=cantidad_tortas-ventas;

        System.out.println("¿Cual es tu nombre?");
        cliente = teclado.nextLine();

        System.out.println("¿" + cliente + " qué deseas hacer en la pasteleria hoy?");
        System.out.println("1. Realizar pedido");
        System.out.println("2. Consultar tortas disponibles");
        System.out.println("3. Ventas realizadas");
        System.out.println("Elige una opción");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:

                System.out.println("¿" + cliente + " cúantas tortas deseas comprar?");
                pedido = teclado.nextInt();
                if (pedido < cantidad_tortas) {
                    cantidad_tortas = cantidad_tortas - pedido;
                    System.out.println(cliente + " gracias por tu compra");
                } else {
                    System.out.println("lo siento " + cliente + ", no tengo tortas suficientes");
                }
                break;
            case 2:
                System.out.println(cliente + " tengo " + cantidad_tortas + " tortas");
                break;
            case 3:
                System.out.println("Las ventas del día de doy fueron: " + ventas);
                break;
            default:

                System.out.println("La opcion elegida no existe");

        }
    }
}