
import java.util.Scanner;

public class Main {

    public static String nombre;
    public static String apellido;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cúal es su nombre?");
        nombre = input.nextLine();
        System.out.println("¿Cúal es su apellido?");
        apellido = input.nextLine();
        System.out.println("Hola " + nombre + " " + apellido);
		
    }
}