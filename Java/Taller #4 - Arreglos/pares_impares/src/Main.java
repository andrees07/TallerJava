import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand= new Random();
        int[] numeros;
        numeros = new int[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }
        System.out.print("Números pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(" " + numeros[i] + ",");
            }
        }
        System.out.println();
        System.out.print("Números impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(" " + numeros[i] + ",");
            }
        }
    }
}