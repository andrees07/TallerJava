import java.util.Scanner;
public class Main {

    public static String nombreCiudad;
    public static String nombrePais;

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Digita una ciudad capital");
        nombreCiudad = input.nextLine();
        System.out.println("Digita el pais respectivo a la ciudad " + nombreCiudad);
        nombrePais = input.nextLine();
        System.out.println("La ciudad " + nombreCiudad + ", es la capital del país " + nombrePais);

    }
}