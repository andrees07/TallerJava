import java.util.Scanner;

public class Main {
    public static int[][] tabla;

    public static void llenar(int[][] tabla) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i+1)*(j+1);
                System.out.println(tabla[i][j]);
            }
        }
    }

    public static void mostrar(){
        System.out.println("Tabla de multiplicar");
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print((i+1) + "x" + (j+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tabla= new int[10][10];
        llenar(tabla);
        mostrar();
        System.out.println("inserte fila y columna de la cual desea ver el resultado");
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("El resultado de " + i + "x" + j + " es: " + tabla[i-1][j-1]);
    }
}