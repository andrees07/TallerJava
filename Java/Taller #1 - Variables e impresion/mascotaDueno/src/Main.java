import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		String nombreMascota , tipoMascota , nombre , apellido;
		int edad;
    
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cúal es el nombre de tu mascota?");
        nombreMascota = input.nextLine();
        System.out.println("¿Cúal es el tipo de " + nombreMascota + "?");
        tipoMascota = input.nextLine();
        System.out.println("¿Cúal es la edad de " + nombreMascota + "? (en años)");
        edad = input.nextInt();
        System.out.println("¿Cúal es tu nombre?");
        input.nextLine();
        nombre = input.nextLine();
        System.out.println("¿" + nombre + " cúal es tu apellido?");
        apellido = input.nextLine();

        System.out.println(nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edad + " años de edad y " + nombre + " " + apellido + " es actualmente su dueño(a).");

    }
}