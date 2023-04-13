import java.util.Scanner;

public class Main {

    public static Scanner teclado = new Scanner(System.in);
    public static String nombre,organizacion,telefono;
    public static int cantidadTelefonos=0;

    public static void agregarTelefono(String[][] agenda) {
        boolean encontrado = false;
        int filavacia=0;
        if (cantidadTelefonos==0) {
            cantidadTelefonos++;
            System.out.println("Ingrese el nombre completo del contacto");
            teclado.nextLine();
            nombre = teclado.nextLine();
            System.out.println("Ingrese el número de teléfono del contacto:");
            telefono = teclado.nextLine();
            System.out.println("Ingrese la organización del contacto:");
            organizacion = teclado.nextLine();
            agenda[0][0] = nombre;
            agenda[0][1] = telefono;
            agenda[0][2] = organizacion;
        }else if (cantidadTelefonos < 3) {
            System.out.println("Ingrese el nombre completo del contacto");
            teclado.nextLine();
            nombre = teclado.nextLine();
            System.out.println("Ingrese el número de teléfono del contacto:");
            telefono = teclado.nextLine();
            System.out.println("Ingrese la organización del contacto:");
            organizacion = teclado.nextLine();
            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][1].equals(telefono)) {
                    System.out.println("El número de teléfono ya está almacenado.");
                    encontrado = true;
                    i= agenda.length;
                }
            }
            if (encontrado == false) {
                cantidadTelefonos++;
                for (int i = 0; i < agenda.length; i++) {
                    if (agenda[i][0] == null) {
                        filavacia = i;
                        i = agenda.length;
                    }
                }
                agenda[filavacia][0] = nombre;
                agenda[filavacia][1] = telefono;
                agenda[filavacia][2] = organizacion;
            }
        } else if (cantidadTelefonos ==3){
            System.out.println("Agenda llena");
        }
    }

    public static String[][] eliminarContacto (String[][] agenda) {
        boolean encontrado=false;
        if (cantidadTelefonos == 0) {
            System.out.println("Agenda vacia");
        } else {
            System.out.println("Escriba el numero de teléfono que desea eliminar");
            teclado.nextLine();
            String contactoAEliminar = teclado.nextLine();

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][1].equals(contactoAEliminar)) {
                    cantidadTelefonos--;
                    encontrado=true;
                    String[][] nuevaAgenda = new String[agenda.length][3];
                    for (int j = 0, k = 0; j < agenda.length; j++) {
                        if (j != i) {
                            nuevaAgenda[k][0] = agenda[j][0];
                            nuevaAgenda[k][1] = agenda[j][1];
                            nuevaAgenda[k][2] = agenda[j][2];
                            k++;
                        }
                        if (j == 2) {
                            nuevaAgenda[k][0] = null;
                            nuevaAgenda[k][1] = "0";
                            nuevaAgenda[k][2] = null;
                        }
                    }
                    agenda = nuevaAgenda;
                    System.out.println("Contacto con telefono: " + telefono + ", ha sido eliminado");
                    i= agenda.length;
                }
            }
            if (encontrado==false){
                System.out.println("El numero de telefono no esta en la agenda");
            }
        }
        return agenda;
    }

    public static void buscarContacto(String[][] agenda) {
        boolean encontrado = false;
        if (cantidadTelefonos == 0) {
            System.out.println("Agenda vacia");
        } else {
            System.out.println("¿Cual telefono deseas buscar?");
            teclado.nextLine();
            telefono = teclado.nextLine();
            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][1].equals(telefono)) {
                    System.out.println("El teléfono " + telefono + " pertenece a " + agenda[i][0]);
                    encontrado = true;
                }
            }
            if (encontrado == false) System.out.println("El telefono " + telefono + " no esta en la agenda");
        }
    }

    public static void main(String[] args) {
        String[][] agenda = new String[3][3];
        agenda[0][1]="0";
        agenda[1][1]="0";
        agenda[2][1]="0";

        int opcion;
        do{
            System.out.println("Agenda");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.println("Elige una opcion");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    agregarTelefono(agenda);
                    break;
                case 2:
                    buscarContacto(agenda);
                    break;
                case 3:
                    agenda = eliminarContacto(agenda);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        }while (opcion!=4);

    }
}