
import java.util.Scanner;

public class Main {

    public static String nombre;
    public static String apellido;
    public static int edad;
    public static double estatura;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cúal es tu apellido?");
        apellido = input.nextLine();
        System.out.println("¿Cúal es tu edad?");
        edad = input.nextInt();
        System.out.println("¿Cúal es tu estatura?");
        estatura = input.nextDouble();
        System.out.println("Hola " + nombre + " " + apellido + "tu edad es " + edad + " y tu estatura es " + estatura+ " metros");


    }
}