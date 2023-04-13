
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        String nombre,apellido,nombrePadre,apellidoPadre,nombreMadre,apellidoMadre;
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cúal es tu nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cúal es tu apellido?");
        apellido = input.nextLine();
        System.out.println("¿Cúal es el nombre de tu padre?");
        nombrePadre = input.nextLine();
        System.out.println("¿Cúal es el apellido de tu padre?");
        apellidoPadre = input.nextLine();
        System.out.println("¿Cúal es el nombre de tu madre?");
        nombreMadre = input.nextLine();
        System.out.println("¿Cúal es su apellido de tu madre?");
        apellidoMadre = input.nextLine();
        System.out.println("Yo " + nombre + " " + apellido + ", soy hijo de " + nombreMadre + " y " + nombrePadre + ".");
    }
}