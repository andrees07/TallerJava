import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal es tu edad");
        edad = teclado.nextInt();
        if (edad<18) System.out.println("Usted aún es un(a) niño(a)");
    }
}