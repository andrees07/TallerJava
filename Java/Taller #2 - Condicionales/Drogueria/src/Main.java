import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String nombre, productoDevolucion;
        int producto, opcion, precio = 0;

        System.out.println("Elija una opción");
        System.out.println("1. Compra de producto");
        System.out.println("2. Consultar precios por producto");
        System.out.println("3. Devoluciones");
        System.out.println("4. Salir");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("Ingrese su nombre:");
                sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Productos disponibles:");
                System.out.println("1. Paracetamol");
                System.out.println("2. Ibuprofeno");
                System.out.println("3. Acetaminofén");
                System.out.println("Seleccione un producto");
                producto = sc.nextInt();

                if (producto == 1) {
                    precio = 2000;
                } else if (producto == 2) {
                    precio = 2500;
                } else if (producto == 3) {
                    precio = 1800;
                }
                if (producto == 1 || producto == 2 || producto == 3)
                System.out.println(nombre + "el precio total de su compra es $" + precio);
                else System.out.println("Opción incorrecta");
            break;

            case 2:

                System.out.println("Productos disponibles:");
                System.out.println("1. Paracetamol = $2 000");
                System.out.println("2. Ibuprofeno = $2 500");
                System.out.println("3. Acetaminofén = $1 800");

            break;
            case 3:
                System.out.println("Ingrese su nombre:");
                sc.nextLine();
                nombre = sc.nextLine();
                System.out.println(nombre + " por favor ingrese el producto a devolver:");
                productoDevolucion = sc.nextLine();
                System.out.println("El " + productoDevolucion + " ha sido devuelto correctamente");
            break;
            case 4:
                System.out.println("Gracias por su visita");
            break;
            default:
            System.out.println("La opcion elegida no existe");
            break;

        }

    }
}