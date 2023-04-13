import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        boolean bandera=true;
        String nombre=" ";

        do {

            System.out.println("Menú de usuario");
            System.out.println("1. Capturar nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¿Cual es tu nombre");
                    teclado.nextLine();
                    nombre = teclado.nextLine();
                        break;
                case 2:
                    if (nombre !=" "){
                        System.out.println("Hola " + nombre + " Cómo estas?");
                    } else {
                        System.out.println("Primero debes Capturar nombre");
                    }
                    break;
                case 3:
                    bandera=false;
                    break;
                default:
                    System.out.println("el número que digitaste no existe");
                    break;
            }

        } while (bandera != false);
        System.out.println("Hello world!");
    }
}