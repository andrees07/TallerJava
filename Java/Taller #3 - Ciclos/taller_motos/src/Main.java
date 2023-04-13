import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static String nombre, placa, observaciones;
    public static int respuesta;

    public static void reparacion(){
        System.out.println("¿Cúal es tu nombre?");
        nombre = sc.nextLine();
        System.out.println("¿" + nombre +  " tu moto es de alto cilindraje?");
        System.out.println("1. Si");
        System.out.println("2. No");
        respuesta = sc.nextInt();
        if (respuesta == 1) {
            System.out.println("¿" + nombre + " cual es la placa de tu moto?");
            placa = sc.nextLine();
            System.out.println("¿" + nombre + " que tiene tu moto de placa: ," + placa);
            observaciones = sc.nextLine();
            System.out.println(nombre + " los arreglos fueron hechos");
        } else if (respuesta == 2) {
            System.out.println(nombre + "aca solo recibimos motos de alto cilindraje");
        } else {
            System.out.println("Opción invalida");
        }

    }

    public static void main(String[] args) {

        reparacion();
    }
}