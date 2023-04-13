import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre, apellidos;
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal es tu nombre?");
        nombre = teclado.nextLine();
        System.out.println("¿Cúales son tus apellidos?");
        apellidos = teclado.nextLine();
        System.out.println("¿Cúal es tu edad?");
        edad = teclado.nextInt();
        if (edad>=18) System.out.println(nombre + " " + apellidos +" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        else {
        if (edad<18) System.out.println(nombre + " " +apellidos + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}