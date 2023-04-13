import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int peso;
        double estatura, imc;

        System.out.println("¿Cúal es tu nombre?");
        nombre = teclado.nextLine();

        System.out.println("¿" + nombre + " cúal es tu peso?; en kilogramos");
        peso = teclado.nextInt();

        System.out.println("¿" + nombre + " cúal es tu estatura?; en metros");
        estatura = teclado.nextDouble();

        imc = peso/(estatura*estatura);
        if (imc<=18.4) {
            System.out.println("tu indice de masa corporal es: " + imc + " lo que significa que tienes bajo peso");
        } else if (imc<= 24.9) {
            System.out.println("tu indice de masa corporal es: " + imc + " lo que significa que tienes peso normal");
        } else if (imc<= 29.9) {
            System.out.println("tu indice de masa corporal es: " + imc + " lo que significa que tienes sobrepeso");
        }else {
            System.out.println("tu indice de masa corporal es: " + imc + " lo que significa que tienes obesidad");
        }
    }
}