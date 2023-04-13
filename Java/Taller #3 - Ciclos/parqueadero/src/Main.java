import java.util.Scanner;

public class Main {
    public static int usuariosPresentes;
    public static Scanner sc = new Scanner(System.in);
    public static String nombre, apellido, resultado;


    public static void registrar_personas (String [][] usuarios){
        boolean encontrado = false;
        int filavacia=0;
        if (usuariosPresentes == 0){
            usuariosPresentes++;
            System.out.println("Ingrese el nombre del usuario");
            sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del usuario:" + nombre);
            apellido = sc.nextLine();
            usuarios[0][0] = nombre;
            usuarios[0][1] = apellido;
        } else if (usuariosPresentes < 8) {
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i][0].equals(nombre) && usuarios[i][1].equals(apellido)){
                    System.out.println("El usuario ya está almacenado.");
                    encontrado = true;
                    i= usuarios.length;
                }
            }
            if (encontrado == false){
                usuariosPresentes++;
                for (int i = 0; i < usuarios.length; i++) {
                    if (usuarios[i][0]==null){
                        filavacia = i;
                        i = usuarios.length;
                    }
                }
                usuarios[filavacia][0] = nombre;
                usuarios[filavacia][1] = apellido;
            }
        } else if (usuariosPresentes == 8){
            System.out.println("No se pueden registrar más usuarios, la capacidad máxima ha sido alcanzada.");
        }

    }

    public static void consultar (String [][] usuarios){
        if (usuariosPresentes == 0){
            System.out.println("No hay usuarios presentes en el curso.");
        }
        else {
            System.out.println("Actualmente hay " + usuariosPresentes + " registrados");
            for (int i = 0; i < usuariosPresentes; i++) {
                nombre = usuarios[i][0];
                apellido = usuarios[i][1];
                System.out.println("nombre: " + nombre + " apellido: " + apellido);
            }
        }
    }

    public static void registrar_resultado_prueba (String [][] usuarios){
                if (usuariosPresentes == 0){
            System.out.println("No hay usuarios presentes en el curso.");
        }
        else {
            System.out.println("Ingrese el nombre del usuario");
            sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del usuario:" + nombre);
            apellido = sc.nextLine();
            for (int i = 0; i < usuariosPresentes; i++) {
                if (usuarios[i][0].equals(nombre) && usuarios[i][1].equals(apellido)){
                    System.out.println("¿Cual es el resultado de la prueba de " + nombre + " " + apellido);
                    resultado = sc.nextLine();
                    usuarios[i][2] = resultado;
                } else System.out.println("El usuario no esta registrado");
            }

        }
    }

    public static void main(String[] args) {
        boolean bandera;

        String[][] usuarios = new String[8][3];
        int opcion;

        usuariosPresentes = 0;
        bandera = true;

        while (bandera != false) {


            System.out.println("Bienvenido a la escuela automovilistica El Maestro");
            System.out.println("1: Registrar ingreso al curso");
            System.out.println("2: Consultar usuarios presentes");
            System.out.println("3: Registrar resultado de prueba");
            System.out.println("4: Salir");
            System.out.println("Ingrese la opción deseada:");
            opcion = sc.nextInt();
            switch (opcion) {


                case 1:
                    registrar_personas(usuarios);
                    break;
                case 2:
                    consultar(usuarios);
                    break;
                case 3:
                    registrar_resultado_prueba(usuarios);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de parqueadero.");
                    bandera =false;
                    break;
                default:
                    System.out.println("Opción inválida, por favor intente nuevamente.");
                    break;
            }
        }
    }

}