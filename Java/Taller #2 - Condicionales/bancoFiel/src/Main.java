import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();
        int cantidad, movimiento, opcion;
        String titular;
        cantidad = rand.nextInt(200) * 1000;

        System.out.println("¿Cual es tu nombre?");
        titular = teclado.nextLine();
        System.out.println("¿" + titular + " qué deseas hacer en el banco hoy?");
        System.out.println("1. Ingreso");
        System.out.println("2. Retiro");
        System.out.println("3. Consulta");
        System.out.println("Elige una opción");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("¿" + titular + " cuanto dinero vas a ingresar en tu cuenta?");
                movimiento = teclado.nextInt();
                if (movimiento > 0) {
                    cantidad = cantidad + movimiento;
                    System.out.println(titular + " tu nuevo saldo es :" + cantidad);
                } else {
                    System.out.println(titular + "El valor a ingresar debe ser mayor a 0");
                }
                break;
            case 2:
                System.out.println("¿" + titular + " cuanto dinero vas a retirar de tu cuenta?");
                movimiento = teclado.nextInt();
                if (movimiento < cantidad) {
                    cantidad = cantidad - movimiento;
                    System.out.println(titular + " tu nuevo saldo es :" + cantidad);
                } else {
                    System.out.println(titular + " el valor a retirar excede tu saldo en la cuenta");

                }
                break;
            case 3:
                System.out.println(titular + " tu saldo en la cuenta es: " + cantidad);
                break;
            default:
                System.out.println("La opcion elegida no existe");
                break;
        }
    }
}