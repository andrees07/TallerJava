import java.util.Scanner;
public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static String cliente,pelicula,respuesta;
    public static boolean anotacion;
    public static int opcion , rta;
    public static void alquilar(){
        System.out.println("¿Cúal es tu nombre?");
        teclado.nextLine();
        cliente = teclado.nextLine();
        System.out.println(cliente + " escribe el nombre de la pelicula");
        pelicula = teclado.nextLine();
        System.out.println("Alquiler exitoso de "+ pelicula);

    }
    public static void consultar(){
        System.out.println("Ant-man and the wasp");
        System.out.println("El gato con botas");
        System.out.println("Anvatar 2");
        System.out.println("Creed 3");
        System.out.println("John Wick 4");
    }
    public static void devolver() {
        System.out.println("¿Cúal es tu nombre?");
        teclado.nextLine();
        cliente = teclado.nextLine();
        System.out.println(cliente + " escribe el nombre de la pelicula");
        pelicula = teclado.nextLine();
        System.out.println("¿Tienes alguna anotación para hacer?");
        System.out.println("1. si o 2.no");
        rta = teclado.nextInt();
        if (rta == 1) {
            anotacion = true;
        } else {
            anotacion = false;
        }
        if (anotacion == true) {
            System.out.println("¿Que sucedio?");
            teclado.nextLine();
            respuesta = teclado.nextLine();
            System.out.println("La pelicula " + pelicula + " que tenia " + cliente + " tiene daños: " + respuesta);
        } else {
            System.out.println("La pelicula " + pelicula + " que tenia " + cliente + " no tiene daños.");
        }
    }
    public static void main(String[] args) {

        System.out.println("Elija una opción");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Entregar pelicula");
        System.out.println("4. Salir");
        opcion = teclado.nextInt();

        switch (opcion){
            case 1:
                alquilar();
                break;
            case 2:
                consultar();
                break;
            case 3:
                devolver();
            case 4:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println( "Valor inválido");
                break;
        }
    }
}