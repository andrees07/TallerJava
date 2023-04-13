import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor #"+i);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "] = " + numeros[i]);
        }
    }
}