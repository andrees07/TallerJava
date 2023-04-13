import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombre, placa, observaciones;
        int cilindraje;
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");
        nombre = teclado.next();
        System.out.println("¿"+nombre + " cual es el cilindraje de tu moto?");
        cilindraje = teclado.nextInt();
        if (cilindraje>=450){
            System.out.println("¿Cúal es la placa de tu moto?");
            teclado.nextLine();
            placa = teclado.nextLine();
            System.out.println("¿"+nombre + " que tiene tu moto de placa " + placa);
            observaciones = teclado.nextLine();
            System.out.println(nombre + " los arreglos fueron hechos");
        }
        else {
            System.out.println(nombre + " aca solo recibimos motos de alto cilindraje");
        }
    }
}