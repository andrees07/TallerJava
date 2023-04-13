import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("escoge un numero");
        numero = teclado.nextInt();
        System.out.println("Tabla de multiplicar");
        for (int i = 1; i <= 10; i++) {
            System.out.println(" " + i + " x " + numero + " = "+ numero*i);
        }
    }
}